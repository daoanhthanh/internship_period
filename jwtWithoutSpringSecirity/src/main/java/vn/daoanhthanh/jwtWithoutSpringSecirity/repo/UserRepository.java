package vn.daoanhthanh.jwtWithoutSpringSecirity.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUserName(String username);
}
