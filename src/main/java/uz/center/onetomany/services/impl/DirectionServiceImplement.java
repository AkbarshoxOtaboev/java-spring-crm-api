package uz.center.onetomany.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.center.onetomany.domains.Direction;
import uz.center.onetomany.repositories.DirectionRepository;
import uz.center.onetomany.services.DirectionService;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectionServiceImplement implements DirectionService {
    private final DirectionRepository directionRepository;

    @Override
    public void save(Direction direction) {
        directionRepository.save(direction);
    }

    @Override
    public Direction getDirectionById(Long id) {
        return directionRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Direction> getAllDirections() {
        return directionRepository.findAll();
    }

    @Override
    public void update(Long id, Direction direction) {
        Direction fetchedDirection = directionRepository.findById(id).orElseThrow();
        fetchedDirection.setName(direction.getName());
        fetchedDirection.setDescription(direction.getDescription());

        directionRepository.save(fetchedDirection);

    }

    @Override
    public void delete(Long id) {
        directionRepository.deleteById(id);
    }
}
