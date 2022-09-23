package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;


import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Transaction;

import java.util.List;


public interface ITransactionService {
    //metodos abstractos
    public Transaction findById(int id);

    public List<Transaction> findAll();

    public Transaction CreateTransaction (Transaction movimiento);

    public Transaction updateTransaction(int id,Transaction movimiento);

    public void deleteTransaction(int id);


}