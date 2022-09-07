package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements ITransactionService{


    @Override
    public Transaction findById(long id) {
        Enterprise empresa = new Enterprise();
        Employee empleado = new Employee();
        Transaction movimiento = new Transaction();
        movimiento.setIdTransaction(id);
        movimiento.setAmount(100000);
        movimiento.setConcept("gastos");
        movimiento.setDetail("compra de bombillos");
        movimiento.setEnterprise(empresa);
        movimiento.setEmployee(empleado);
        movimiento.setState(true);
        return movimiento;
    }

    @Override
    public Transaction CreateTransaction(Transaction movimiento) {
        Transaction newMovimiento = new Transaction();
        newMovimiento.setIdTransaction(1);
        newMovimiento.setAmount(movimiento.getAmount());
        newMovimiento.setConcept(movimiento.getConcept());
        newMovimiento.setDetail(movimiento.getDetail());
        newMovimiento.setEnterprise(movimiento.getEnterprise());
        newMovimiento.setEmployee(movimiento.getEmployee());
        newMovimiento.setState(movimiento.isState());
        return movimiento;
    }

    @Override
    public Transaction updateTransaction(long id, Transaction movimiento) {
        Transaction putTransaction = findById(id);
        putTransaction.setAmount(movimiento.getAmount());
        putTransaction.setConcept(movimiento.getConcept());
        putTransaction.setDetail(movimiento.getDetail());
        putTransaction.setEnterprise(movimiento.getEnterprise());
        putTransaction.setEmployee(movimiento.getEmployee());
        putTransaction.setState(movimiento.isState());
        return putTransaction;
    }

    @Override
    public void deleteTransaction(long id) {
        Transaction deleteTransaction = findById(id);
    }
}
