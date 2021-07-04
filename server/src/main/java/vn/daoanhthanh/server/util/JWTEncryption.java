package vn.daoanhthanh.server.util;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.Function;


public class JWTEncryption {
    @Value("${jwt.secret}")
    private String SECRET_KEY;
    @Autowired
    private RedisTemplate<Object, Object> template;

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    public boolean CheckToken(String authorizationHeader) {
        try {
            String token = authorizationHeader.substring(7);

            String userName = getAllClaimsFromToken(token).getSubject();
            return validateToken(token, userName);
        } catch (SignatureException | MalformedJwtException | ExpiredJwtException e) {
            throw new RuntimeException();
        }
    }

    public Boolean validateToken(String token, String userName) {
        return (userName.equals(template.opsForValue().get(token)) && !isTokenExpired(token));
    }

    private Boolean isTokenExpired(String token) {
        return getExpirationFromToken(token).before(new Date());
    }

    private Date getExpirationFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResovler) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResovler.apply(claims);
    }

}
