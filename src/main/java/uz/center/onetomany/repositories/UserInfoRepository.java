package uz.center.onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.center.onetomany.domains.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo ,Long> {
}
