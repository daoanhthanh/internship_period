package vn.daoanhthanh.jwtWithoutSpringSecirity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getUserByUsername(String username);
}
