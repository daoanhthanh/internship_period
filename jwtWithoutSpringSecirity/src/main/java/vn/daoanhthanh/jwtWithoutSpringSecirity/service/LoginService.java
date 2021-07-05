package vn.daoanhthanh.jwtWithoutSpringSecirity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;
import vn.daoanhthanh.jwtWithoutSpringSecirity.repo.UserRepository;
import vn.daoanhthanh.jwtWithoutSpringSecirity.utils.PasswordUtil;

@Service
public class LoginService {
    private final UserRepository userRepository;
    private final RedisTemplate<Object, Object> template;
    private final PasswordUtil passwordUtil;

    @Autowired
    public LoginService(UserRepository userRepository, RedisTemplate<Object, Object> template,
            PasswordUtil passwordUtil) {
        this.userRepository = userRepository;
        this.template = template;
        this.passwordUtil = passwordUtil;
    }

    public User checkUser(String username, String password) throws Exception {
        User user = userRepository.findUserByUserName(username).orElse(null);
        if (user == null) {
            throw new Exception("User not found");
        }
        if (!passwordUtil.verifyUserPassword(password, user.getPassword(), passwordUtil.getSalt(20))) {
            throw new Exception("wrong password");
        }
        return user;

    }

    public void Logout(String jwt) {
        template.delete(jwt);
    }

}
