package uz.center.onetomany.services;

import uz.center.onetomany.domains.Teacher;
import uz.center.onetomany.dto.TeacherWithInfoDTO;

import java.util.List;

public interface TeacherService {

    void save(Long directionId, TeacherWithInfoDTO teacherWithInfoDTO);

    Teacher getTeacherById(Long id);

    List<Teacher> getAllTeachers();

    void update(Long id);

    void delete(Long id);

}
