package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Transaction;
import bigworkers.ingresoegreso.ferreteria.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService{

    @Autowired
    private ITransactionRepository transactionRepository;

    @Override
    public Transaction findById(int id) {
        Optional<Transaction> movimiento = transactionRepository.findById((long)id);
        return movimiento.get();
    }

    @Override
    public List<Transaction> findAll() {
        List<Transaction> movimientos = (List<Transaction>) transactionRepository.findAll();
        return movimientos;
    }

    @Override
    public Transaction CreateTransaction(Transaction movimiento) {
        Transaction newMovimiento = transactionRepository.save(movimiento);
        return newMovimiento;
    }

    @Override
    public Transaction updateTransaction(int id, Transaction movimiento) {
        Transaction putMovimiento = transactionRepository.save(movimiento);
        return putMovimiento;
    }

    @Override
    public void deleteTransaction(int id) {
        transactionRepository.deleteById((long)id);
    }
}