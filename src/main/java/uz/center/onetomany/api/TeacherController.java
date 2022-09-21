package uz.center.onetomany.api;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.center.onetomany.domains.Teacher;
import uz.center.onetomany.dto.TeacherWithInfoDTO;
import uz.center.onetomany.services.TeacherService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("v1/api/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @PostMapping("/{directionId}/save")
    public ResponseEntity<String> saveTeacherWithInfoAndDirection(@PathVariable("directionId") Long directionId, @RequestBody TeacherWithInfoDTO teacherWithInfoDTO){
        teacherService.save(directionId, teacherWithInfoDTO);
        return ResponseEntity.ok("Successfully");
    }

    @GetMapping("/{teacherId}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable("teacherId") Long teacherId){
        return ResponseEntity.ok(teacherService.getTeacherById(teacherId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Teacher>> getAllTeacher(){
        return ResponseEntity.ok(teacherService.getAllTeachers());
    }
}
