package uz.center.onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.center.onetomany.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
