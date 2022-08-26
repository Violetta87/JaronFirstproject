package repository;

import model.SpaceshipModel;
import org.springframework.data.repository.CrudRepository;

public interface SpaceshipRepository extends CrudRepository<SpaceshipModel, Long> {
}
