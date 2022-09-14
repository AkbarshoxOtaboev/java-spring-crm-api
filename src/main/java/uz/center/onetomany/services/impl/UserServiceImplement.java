package uz.center.onetomany.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.center.onetomany.domains.User;
import uz.center.onetomany.domains.UserInfo;
import uz.center.onetomany.repositories.UserRepository;
import uz.center.onetomany.services.UserService;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;


    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void saveUserWithInfo(Long id, UserInfo userInfo) {
        User user = userRepository.findById(id).orElseThrow();
        user.setUserInfo(userInfo);
        userRepository.saveAndFlush(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found"));
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
