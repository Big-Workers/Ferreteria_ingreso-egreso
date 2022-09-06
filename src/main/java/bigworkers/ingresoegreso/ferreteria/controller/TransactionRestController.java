package bigworkers.ingresoegreso.ferreteria.controller;


import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class TransactionRestController {

    @GetMapping("/transaction/{id}")
    public Transaction findById(@PathVariable long id){
        Transaction movimiento = new Transaction();
        movimiento.setIdTransaction(id);
        movimiento.setAmount(100000);
        movimiento.setConcept("gastos");
        movimiento.setDetail("compra de bombillos");
        movimiento.setEnterprise(movimiento.getEnterprise());
        movimiento.setEmployee(movimiento.getEmployee());
        movimiento.setState(movimiento.isState());
        return movimiento;


    }
    @PostMapping("/transaction")
    public Transaction CreateTransaction (@RequestBody Transaction movimiento){
        Transaction newMovimiento = new Transaction();
        newMovimiento.setIdTransaction(1);
        newMovimiento.setAmount(movimiento.getAmount());
        newMovimiento.setConcept(movimiento.getConcept());
        newMovimiento.setDetail(movimiento.getDetail());
        newMovimiento.setEnterprise(movimiento.getEnterprise());
        newMovimiento.setEmployee(movimiento.getEmployee());
        newMovimiento.setState(movimiento.isState());
        return newMovimiento;

    }
    @PutMapping("/transaction/{id}")
    public Transaction updateTransaction(@PathVariable long id, @RequestBody Transaction movimiento){
        Transaction putTransaction = findById(id);
        putTransaction.setAmount(movimiento.getAmount());
        putTransaction.setConcept(movimiento.getConcept());
        putTransaction.setDetail(movimiento.getDetail());
        putTransaction.setEnterprise(movimiento.getEnterprise());
        putTransaction.setEmployee(movimiento.getEmployee());
        putTransaction.setState(movimiento.isState());
        return putTransaction;

    }
    @DeleteMapping("/transaction/{id}")
    public void deleteTransaction(@PathVariable long id){
        Transaction putTransaction = findById(id);
    }


}
