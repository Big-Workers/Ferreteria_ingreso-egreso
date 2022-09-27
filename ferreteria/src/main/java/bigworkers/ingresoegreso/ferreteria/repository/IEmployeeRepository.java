package bigworkers.ingresoegreso.ferreteria.repository;

import bigworkers.ingresoegreso.ferreteria.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}
