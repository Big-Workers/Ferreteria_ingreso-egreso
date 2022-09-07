package bigworkers.ingresoegreso.ferreteria.controller;


import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import bigworkers.ingresoegreso.ferreteria.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class TransactionRestController {

    @Autowired //inyecta las interfases
    public ITransactionService TransactionService;


    @GetMapping("/transaction/{id}")
    public Transaction findById(@PathVariable long id){
        return TransactionService.findById(id);


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
