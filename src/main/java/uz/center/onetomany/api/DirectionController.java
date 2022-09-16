package uz.center.onetomany.api;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.center.onetomany.domains.Direction;
import uz.center.onetomany.services.DirectionService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/api/direction")
public class DirectionController {

    private final DirectionService directionService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Direction direction){
        directionService.save(direction);
        return ResponseEntity.ok("Direction has been saved");
    }

    @GetMapping("/all")
    public ResponseEntity<List<Direction>> getAllDirection(){
        return ResponseEntity.ok(directionService.getAllDirections());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Direction> getDirection(@PathVariable("id") Long id){
        return ResponseEntity.ok(directionService.getDirectionById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable("id") Long id, @RequestBody Direction direction){
        directionService.update(id,direction);
        return ResponseEntity.ok("Direction has been updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        directionService.delete(id);
        return ResponseEntity.ok("Direction is deleted");
    }
}
