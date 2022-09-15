package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;


@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class);
    @GetMapping("/")
    private String index(){
        LOG.log(Level.INFO, "index");
        return "index";
    }
}
