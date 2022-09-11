package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Transaction;

import java.util.List;


public interface ITransactionService {
    //metodos abstractos
    public Transaction findById(long id);

    public List<Transaction> findAll();

    public Transaction CreateTransaction (Transaction movimiento);

    public Transaction updateTransaction(long id,Transaction movimiento);

    public void deleteTransaction(long id);


}
