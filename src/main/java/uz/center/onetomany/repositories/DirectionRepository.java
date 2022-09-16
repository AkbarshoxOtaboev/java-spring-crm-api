package uz.center.onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.center.onetomany.domains.Direction;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
}
