package bigworkers.ingresoegreso.ferreteria.repository;

import bigworkers.ingresoegreso.ferreteria.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface IProfileRepository extends CrudRepository<Profile, Long> {
}
