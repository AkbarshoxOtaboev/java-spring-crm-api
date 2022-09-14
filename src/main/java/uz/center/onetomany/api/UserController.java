package uz.center.onetomany.api;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.center.onetomany.domains.User;
import uz.center.onetomany.domains.UserInfo;
import uz.center.onetomany.services.UserService;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/v1/api/user")
public class UserController {

    private final UserService userService;
    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        userService.save(user);
        return ResponseEntity.ok("User has been saved");
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getALLUsersFromDB(){
        return ResponseEntity.ok(userService.getAllUser());
    }

    @PostMapping("/save/{id}/info")
    public ResponseEntity<String> saveInfoWithUser(@PathVariable("id") Long id, @RequestBody UserInfo userInfo){
        userService.saveUserWithInfo(id, userInfo);
        return ResponseEntity.ok("User info has been saved");
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }


}
