package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class TransactionController {

    private final Logger LOG = Logger.getLogger(""+TransactionController.class);
    @GetMapping("/transactions")
    private String transactions(){
        LOG.log(Level.INFO, "transactions");
        return "/transactions/view";
    }
}
