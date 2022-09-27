package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Employee;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Enterprise;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Transaction;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.EnterpriseService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IEmployeeService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IEnterpriseService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




@Controller
public class TransactionController {

    @Autowired
    private ITransactionService TransactionService;
    @Autowired
    private IEmployeeService EmployeeService;

    @Autowired
    private IEnterpriseService EnterpriseService;
    private final Logger LOG = Logger.getLogger(""+TransactionController.class);

    public Timestamp date () {
        Timestamp myDate = Timestamp.from(Instant.now());
        return myDate;
    }
    @GetMapping("/transactions/list")
    private String getListTransaction(Model model){
        LOG.log(Level.INFO, "getListTransaction");
        List<Transaction> transacciones = TransactionService.findAll();
        for (Transaction transaccion : transacciones)
            System.out.println(transaccion.toString());
        model.addAttribute( "transacciones",transacciones);
        return "/transactions/list";
    }
    @GetMapping("/transactions/registration")
    private String createTransaction(Model modelo) {
        LOG.log(Level.INFO, "createTransaction");
        //visualizar la transaccion
        Transaction transaction = new Transaction();
        transaction.setCreatedAt(date());
        modelo.addAttribute("transaction",transaction);
        //visualizar el empleado
        List<Employee> empleados= EmployeeService.findAll();
        modelo.addAttribute("empleados",empleados);
        List<Enterprise> empresas = EnterpriseService.findAll();
        modelo.addAttribute("empresas", empresas);
        return "/transactions/registration";

    }

    @PostMapping("/guardar")
    public String guardarTransaccion (Transaction transaccion){
        LOG.log(Level.INFO, "guardarTransaccion");
        transaccion.setState(true);
        transaccion.setUpdatedAt(date());
        System.out.println(transaccion.toString());
        transaccion = TransactionService.CreateTransaction(transaccion);
        return "redirect:/transactions/list";
    }
    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteTransaction(@PathVariable ("id") long id , Model modelo){
    LOG.log(Level.INFO, "deleteTransaction");
        return "redirect:/transactions/list";
    }


}

