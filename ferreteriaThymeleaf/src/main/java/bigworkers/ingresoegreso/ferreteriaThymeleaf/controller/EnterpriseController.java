package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Enterprise;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.EnterpriseService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EnterpriseController {

    @Autowired
    private IEnterpriseService enterpriseService;

    private final Logger LOG = Logger.getLogger(""+EnterpriseController.class);
    private Validator validator;

    @GetMapping("/enterprises/list")
    public String getListEnterprise(Model model){
        LOG.log(Level.INFO,"getListEnterprises");
        List<Enterprise> enterprises = enterpriseService.findAll();
        model.addAttribute("enterprises", enterprises);
        return "enterprises/list";
    }
    @GetMapping("/enterprises/crear")
    public String CreateEnterprise(Model model) {
        LOG.log(Level.INFO, "createEnterprises");
        //Enterprise
        Enterprise enterprise = new Enterprise();
        model.addAttribute("enterprise", enterprise);
        List<Enterprise> enterprises = enterpriseService.findAll();
        return "enterprises/registration";
    }
    @PostMapping ("/guardar")
    public String guardarEnterprise( @Valid Enterprise empresas, BindingResult error, Model modelo) {
        LOG.log(Level.INFO, "guardar Enterprise");
        return "enterprises/list";
    }

    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editEnterprise(@PathVariable("id") int id, Model modelo){
        LOG.log(Level.INFO,"editEnterprise");
        Enterprise enterprise  = enterpriseService.findById(id);
        modelo.addAttribute("enterprise", enterprise);
        return "enterprise/modificar";
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public String deleteEnterprise(@PathVariable("id") int id, Model modelo) {
        LOG.log(Level.INFO, "deleteEnterprise");
        enterpriseService.deleteEnterprise(id);
        return "redirect:/Enterprises/list";
    }
}
