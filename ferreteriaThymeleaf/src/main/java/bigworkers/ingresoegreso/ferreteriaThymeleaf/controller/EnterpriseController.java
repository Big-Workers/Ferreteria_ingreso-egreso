package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EnterpriseController {

    private final Logger LOG = Logger.getLogger(""+EnterpriseController.class);
    @GetMapping("/enterprises")
    private String enterprise(){
        LOG.log(Level.INFO, "enterprises");
        return "/enterprises/view";
    }
}
