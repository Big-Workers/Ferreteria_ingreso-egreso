package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import bigworkers.ingresoegreso.ferreteria.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService{

    @Autowired
    private ITransactionRepository TransactionRepository;

    @Override
    public Transaction findById(long id) {
        Optional<Transaction> movimiento = TransactionRepository.findById(id);
        return movimiento.get();
    }

    @Override
    public List<Transaction> findAll() {
        List<Transaction> movimientos = (List<Transaction>) TransactionRepository.findAll();
        return movimientos;
    }

    @Override
    public Transaction CreateTransaction(Transaction movimiento) {
        Transaction newMovimiento = TransactionRepository.save(movimiento);
        return newMovimiento;
    }

    @Override
    public Transaction updateTransaction(long id, Transaction movimiento) {
        Transaction putMovimiento = TransactionRepository.save(movimiento);
        return putMovimiento;
    }

    @Override
    public void deleteTransaction(long id) {
        TransactionRepository.deleteById(id);
    }
}
