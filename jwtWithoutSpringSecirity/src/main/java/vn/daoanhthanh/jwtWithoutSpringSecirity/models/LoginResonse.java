package vn.daoanhthanh.jwtWithoutSpringSecirity.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginResonse {
    private final String jwt;
    private String username;
}
