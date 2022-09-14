package uz.center.onetomany.services;

import uz.center.onetomany.domains.UserInfo;

public interface UserInfoService {

    void saveUserWithInfo(Long id, UserInfo userInfo);
}
