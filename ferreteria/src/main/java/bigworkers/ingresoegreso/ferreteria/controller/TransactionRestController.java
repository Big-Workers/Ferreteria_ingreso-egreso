package bigworkers.ingresoegreso.ferreteria.controller;


import bigworkers.ingresoegreso.ferreteria.entities.Transaction;
import bigworkers.ingresoegreso.ferreteria.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/enterprise")

public class TransactionRestController {

    @Autowired //inyecta las interfases
    public ITransactionService TransactionService;


    @GetMapping("/{id}/transaction")
    public Transaction findById(@PathVariable int id){
        return TransactionService.findById(id);
    }

    @GetMapping("/transaction")
    public List<Transaction> findAll(){
        return TransactionService.findAll();

    }

    @PostMapping("/transaction")
    public Transaction CreateTransaction (@RequestBody Transaction movimiento){
        return TransactionService.CreateTransaction(movimiento);

    }
    @PutMapping("/{id}/transaction")
    public Transaction updateTransaction(@PathVariable int id, @RequestBody Transaction movimiento){
        return TransactionService.updateTransaction(id, movimiento);

    }
    @DeleteMapping("/{id}/transaction")
    public void deleteTransaction(@PathVariable int id){
        TransactionService.deleteTransaction(id);
    }


}