package uz.center.onetomany.services;

import uz.center.onetomany.domains.Direction;

import java.util.List;

public interface DirectionService {

    void save(Direction direction);

    Direction getDirectionById(Long id);

    List<Direction> getAllDirections();

    void update (Long id, Direction direction);

    void delete (Long id);
}
