package vn.daoanhthanh.jwtWithoutSpringSecirity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import vn.daoanhthanh.jwtWithoutSpringSecirity.models.LoginRequest;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.LoginResponse;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;
import vn.daoanhthanh.jwtWithoutSpringSecirity.service.LoginService;
import vn.daoanhthanh.jwtWithoutSpringSecirity.utils.JwtAuthenticationController;

@RestController
public class LoginController {
    private final LoginService loginService;
    private final JwtAuthenticationController jwtAuthenticationController;

    public LoginController(LoginService loginService, JwtAuthenticationController jwtAuthenticationController) {
        this.loginService = loginService;
        this.jwtAuthenticationController = jwtAuthenticationController;
    }

    /**
     * Check if user does exist in db, then create a login session using JWT
     * 
     * @param loginRequest
     * @return http reponse
     * @throws Exception
     */
    @PostMapping("/login")
    public ResponseEntity<?> createAuthentication(@RequestBody LoginRequest loginRequest) throws Exception {

        User user = loginService.checkUser(loginRequest.getUsername(), loginRequest.getPassword());
        String token = "";
        if (user != null) {
            token = jwtAuthenticationController.generateToken(loginRequest.getUsername());
        }
        return new ResponseEntity<>(new LoginResponse(token, loginRequest.getUsername()), HttpStatus.OK);
    }

    /**
     * Delete current login session in db
     * 
     * @param
     * jwt
     * @return
     */
    @PostMapping("/logout")
    public ResponseEntity<?> Logout(@RequestParam(name = "jwt") String jwt) {
        loginService.Logout(jwt);
        return new ResponseEntity<>("Goodbye", HttpStatus.OK);
    }

}
