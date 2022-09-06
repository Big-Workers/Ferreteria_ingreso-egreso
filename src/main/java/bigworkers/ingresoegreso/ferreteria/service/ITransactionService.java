package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ITransactionService {
    //metodos abstractos
    public Transaction findById(long id);

    public Transaction CreateTransaction (Transaction movimiento);

    public Transaction updateTransaction(long id,Transaction movimiento);

    public void deleteTransaction(long id);


}
