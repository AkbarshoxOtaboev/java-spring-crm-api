package uz.center.onetomany.services;

import uz.center.onetomany.domains.User;
import uz.center.onetomany.domains.UserInfo;

import java.util.List;

public interface UserService {

    void save(User user);

    void saveUserWithInfo(Long id, UserInfo userInfo);

    User getUserById(Long id);

    List<User> getAllUser();

    User update(User user, Long id);

    void delete(Long id);
}
