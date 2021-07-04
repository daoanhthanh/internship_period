package vn.daoanhthanh.jwtWithoutSpringSecirity.service;

import java.util.List;
import java.util.Optional;

import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;

public interface UserService {
    boolean delete(Long id);

    List<User> findAll();

    User findById(Long id);

    Optional<User> findByUsername(String username);
}
