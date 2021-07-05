package vn.daoanhthanh.jwtWithoutSpringSecirity.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;
import vn.daoanhthanh.jwtWithoutSpringSecirity.repo.UserRepository;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findUserByUserName(username);
    }

}
