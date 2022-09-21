package uz.center.onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.center.onetomany.domains.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
