package vn.daoanhthanh.jwtWithoutSpringSecirity.interceptor;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import vn.daoanhthanh.jwtWithoutSpringSecirity.utils.JwtAuthenticationController;

@Component
public class Interceptor implements HandlerInterceptor {
    private static final String[] AllowApi = { "^/login$", "^/login?error", "^/error", "^/v2/api-docs$",
            "^/configuration/ui$", "^/swagger-resources$", "^/swagger-resources/\\**$", "^/swagger-ui.html$",
            "^/webjars/\\**$", "^/swagger-resources/configuration/ui$", "^/swagger-ui.html$" };
    private final JwtAuthenticationController jwtAuthenticationController;

//    @Autowired
    public Interceptor(JwtAuthenticationController jwtAuthenticationController) {
        this.jwtAuthenticationController = jwtAuthenticationController;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String authorizationHeader = request.getHeader("Authorization");

        if (AllowApiInterceptor(request))
            return true;

        if (authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {

            throw new Exception("JWT not found");

        }

        if (authorizationHeader.startsWith("Bearer ")) {

            return jwtAuthenticationController.CheckToken(authorizationHeader);
            //
            // response.getWriter().write(" Unauthorize");
            // response.setContentType("application/json");
            // response.setCharacterEncoding("UTF-8");
            // response.setStatus(401);
        }

        return true;
    }

    private boolean AllowApiInterceptor(HttpServletRequest request) {

        for (String allowApi : AllowApi) {

            Pattern pattern = Pattern.compile(allowApi);
            String url = request.getRequestURI();

            boolean matches = pattern.matcher(url).matches();

            if (matches) {
                return true;
            }
        }

        return false;
    }

}
