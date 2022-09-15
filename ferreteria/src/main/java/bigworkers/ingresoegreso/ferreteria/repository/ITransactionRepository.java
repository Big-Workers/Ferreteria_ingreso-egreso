package bigworkers.ingresoegreso.ferreteria.repository;

import bigworkers.ingresoegreso.ferreteria.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface ITransactionRepository extends CrudRepository<Transaction, Long> {
}
