package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;
@Controller
public class MenuController {

    private final Logger LOG = Logger.getLogger(""+MenuController.class);
    @GetMapping("/menu")
    private String menu(){
        LOG.log(Level.INFO, "menu");
        return "menu";
    }
    @GetMapping("/menu2")
    private String menuOperator(){
        LOG.log(Level.INFO, "menuOperator");
        return "menuOperator";
    }
}
