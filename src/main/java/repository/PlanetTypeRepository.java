package repository;

import model.PlanetTypeModel;
import org.springframework.data.repository.CrudRepository;

public interface PlanetTypeRepository extends CrudRepository<PlanetTypeModel, Long> {
}
