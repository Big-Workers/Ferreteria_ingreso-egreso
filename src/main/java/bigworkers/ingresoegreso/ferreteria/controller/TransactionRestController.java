package bigworkers.ingresoegreso.ferreteria.controller;


import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import bigworkers.ingresoegreso.ferreteria.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")

public class TransactionRestController {

    @Autowired //inyecta las interfases
    public ITransactionService TransactionService;


    @GetMapping("/transaction/{id}")
    public Transaction findById(@PathVariable long id){
        return TransactionService.findById(id);
    }

    @GetMapping("/transaction")
    public List<Transaction> findAll(){
        List<Transaction> transacciones = new ArrayList<Transaction>();
        Enterprise empresa = new Enterprise();
        Employee empleado = new Employee();
        Transaction movimiento = new Transaction();
        movimiento.setIdTransaction(1);
        movimiento.setAmount(100000);
        movimiento.setConcept("gastos");
        movimiento.setDetail("compra de bombillos");
        movimiento.setEnterprise(empresa);
        movimiento.setEmployee(empleado);
        movimiento.setState(true);
        Transaction movimiento2 = new Transaction();
        movimiento2.setIdTransaction(2);
        movimiento2.setAmount(200000);
        movimiento2.setConcept("ventas");
        movimiento2.setDetail("compra de bombillos");
        movimiento2.setEnterprise(empresa);
        movimiento2.setEmployee(empleado);
        movimiento2.setState(true);
        return transacciones;

    }

    @PostMapping("/transaction")
    public Transaction CreateTransaction (@RequestBody Transaction movimiento){
        return TransactionService.CreateTransaction(movimiento);

    }
    @PutMapping("/transaction/{id}")
    public Transaction updateTransaction(@PathVariable long id, @RequestBody Transaction movimiento){
        return TransactionService.updateTransaction(id, movimiento);

    }
    @DeleteMapping("/transaction/{id}")
    public void deleteTransaction(@PathVariable long id){
        TransactionService.deleteTransaction(id);
    }


}
