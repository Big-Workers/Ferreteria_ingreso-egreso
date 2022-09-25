package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.DocumentType;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Employee;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IDocumentTypeService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IEmployeeService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IDocumentTypeService documentTypeService;

    @Autowired
    private IProfileService profileService;
    private final Logger LOG = Logger.getLogger(""+EmployeeController.class);
    @GetMapping("/employees")
    private String employee() {
        LOG.log(Level.INFO, "employees");
        return "/employees/view";
    }


    @GetMapping("/employee/create")
    public String createEmployee(Model model){
    //public String createEmployee(Model model){
        LOG.log(Level.INFO,"createEmployee");
        //Employee
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        //DocumentType
        List<DocumentType> documentTypes = documentTypeService.findAll();
        model.addAttribute("documentType", documentTypes);
        //
        return "/employee/modify";
    }

    @PostMapping("/modify")
    public String saveEmployee(Employee user){
        LOG.log(Level.INFO, "saveEmployee");
        user = employeeService.createEmployee(user);
        return "redirect:/employee/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public  String editEmployee(@PathVariable("")long idEmployee, Model model){
        LOG.log(Level.INFO, "editEmployee");
        Employee employee = employeeService.findById(idEmployee);
        model.addAttribute("employee", employee);
        return "/modify/employee";
    }



}
