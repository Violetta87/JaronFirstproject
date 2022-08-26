package repository;

import model.PlanetModel;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<PlanetModel, Long> {

}
