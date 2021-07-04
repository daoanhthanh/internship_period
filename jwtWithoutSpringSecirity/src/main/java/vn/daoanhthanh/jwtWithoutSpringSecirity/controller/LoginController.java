package vn.daoanhthanh.jwtWithoutSpringSecirity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.daoanhthanh.jwtWithoutSpringSecirity.models.LoginRequest;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.LoginResonse;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;
import vn.daoanhthanh.jwtWithoutSpringSecirity.service.LoginService;
import vn.daoanhthanh.jwtWithoutSpringSecirity.utils.JwtAuthenticationController;

@RestController
public class LoginController {
    private final LoginService loginService;
    private final JwtAuthenticationController jwtAuthenticationController;

    @Autowired
    public LoginController(LoginService loginService, JwtAuthenticationController jwtAuthenticationController) {
        this.loginService = loginService;
        this.jwtAuthenticationController = jwtAuthenticationController;
    }

    @PostMapping("/login")
    public ResponseEntity<?> createAuthentication(@RequestBody LoginRequest loginRequest) throws Exception {

        User user = loginService.checkUser(loginRequest.getUsername(), loginRequest.getPassword());
        String token = "";
        if (user != null) {
            token = jwtAuthenticationController.generateToken(loginRequest.getUsername());
        }
        return new ResponseEntity<>(new LoginResonse(token, loginRequest.getUsername()), HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> Logout(@RequestParam(name = "jwt") String jwt) {
        loginService.Logout(jwt);
        return new ResponseEntity<>("Goodbye", HttpStatus.OK);
    }

}
