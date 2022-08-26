package repository;

import model.ReservationModel;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationModel, Long>{
}
