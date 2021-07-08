package vn.daoanhthanh.jwtWithoutSpringSecirity.service;

import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 794f88c6d68b2deae5b6e0ce1d1029f3c52b7b68

import org.springframework.stereotype.Service;
import vn.daoanhthanh.jwtWithoutSpringSecirity.models.User;
import vn.daoanhthanh.jwtWithoutSpringSecirity.repo.UserRepository;
@Service
<<<<<<< HEAD
@RequiredArgsConstructor
=======
>>>>>>> 794f88c6d68b2deae5b6e0ce1d1029f3c52b7b68
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

<<<<<<< HEAD
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
=======
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
>>>>>>> 794f88c6d68b2deae5b6e0ce1d1029f3c52b7b68

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
