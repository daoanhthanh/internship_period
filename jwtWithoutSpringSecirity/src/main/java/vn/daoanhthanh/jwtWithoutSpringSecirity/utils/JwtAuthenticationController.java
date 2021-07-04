package vn.daoanhthanh.jwtWithoutSpringSecirity.utils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.entities.User;
import vn.daoanhthanh.jwtWithoutSpringSecirity.service.UserService;

public class JwtAuthenticationController {

    @Value("${jwt.secret}")
    private String SECRET_KEY;

    @Autowired
    private RedisTemplate<Object, Object> template;
    @Autowired
    private UserService userService;

    public String gerUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    public Date getExpirationFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResovler) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResovler.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        return getExpirationFromToken(token).before(new Date());
    }

    public String generateToken(String username) {

        Map<String, Object> claims = new HashMap<>();
        String token = doGenerateToken(claims, username);
        template.opsForValue().set(token, username);

        return token;
    }

    private String doGenerateToken(Map<String, Object> claims, String userName) {
        Instant issuaAt = Instant.now().truncatedTo(ChronoUnit.SECONDS);
        Instant expiration = issuaAt.plus(30, ChronoUnit.SECONDS);

        Optional<User> user = userService.findByUsername(userName);
        long userid = user.get().getId();

        return Jwts.builder().setClaims(claims).setSubject(userName).setIssuedAt(Date.from(issuaAt))
                .setExpiration(Date.from(expiration)).claim("user-id", userid)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
    }

    public Boolean validateToken(String token, String username) {
        return (username.equals(template.opsForValue().get(token)) && !isTokenExpired(token));
    }

    public Boolean CheckToken(String authorizationHeader) throws Exception {
        try {
            String token = authorizationHeader.substring(7);

            String username = getAllClaimsFromToken(token).getSubject();
            return validateToken(token, username);
        } catch (SignatureException | MalformedJwtException | ExpiredJwtException e) {
            throw new Exception("JWT not found");
        }

    }
}
