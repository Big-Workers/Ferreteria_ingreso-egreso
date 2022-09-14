package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeController {
    private final Logger LOG = Logger.getLogger(""+EmployeeController.class);
    @GetMapping("/employees")
    private String employee(){
        LOG.log(Level.INFO, "employees");
        return "/employees/view";
    }
}
