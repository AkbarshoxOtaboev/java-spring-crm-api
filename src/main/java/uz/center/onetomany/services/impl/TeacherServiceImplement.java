package uz.center.onetomany.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.center.onetomany.domains.Direction;
import uz.center.onetomany.domains.Teacher;
import uz.center.onetomany.domains.UserInfo;
import uz.center.onetomany.dto.TeacherWithInfoDTO;
import uz.center.onetomany.repositories.DirectionRepository;
import uz.center.onetomany.repositories.TeacherRepository;
import uz.center.onetomany.services.DirectionService;
import uz.center.onetomany.services.TeacherService;

import java.util.List;

@Service
@AllArgsConstructor
public class TeacherServiceImplement implements TeacherService {
    private final TeacherRepository teacherRepository;
    private final DirectionService directionService;
    @Override
    public void save(Long directionId, TeacherWithInfoDTO teacherWithInfoDTO) {
        Direction direction = directionService.getDirectionById(directionId);
        Teacher teacher = new Teacher();
        teacher.setFullName(teacherWithInfoDTO.getFullName());
        UserInfo userInfo = new UserInfo();
        userInfo.setPhone(teacherWithInfoDTO.getPhone());
        userInfo.setAddress(teacherWithInfoDTO.getAddress());
        userInfo.setBirthDay(teacherWithInfoDTO.getBirthDay());
        userInfo.setPassportInfo(teacherWithInfoDTO.getPassportInfo());
        userInfo.setPassporSeries(teacherWithInfoDTO.getPassporSeries());
        userInfo.setPassportPersonalNumber(teacherWithInfoDTO.getPassportPersonalNumber());
        userInfo.setCvUri(teacherWithInfoDTO.getCvUri());
        teacher.setDirection(direction);
        teacher.setUserInfo(userInfo);
        teacherRepository.saveAndFlush(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(Long id) {

    }
}
