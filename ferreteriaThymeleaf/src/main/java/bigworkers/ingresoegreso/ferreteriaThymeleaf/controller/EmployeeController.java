package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.DocumentType;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Employee;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Enterprise;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Profile;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IDocumentTypeService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IEmployeeService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IEnterpriseService;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.callback.LanguageCallback;
import java.sql.Timestamp;
import java.time.Instant;
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

    @Autowired
    private IEnterpriseService enterpriseService;

    private final Logger LOG = Logger.getLogger(""+EmployeeController.class);

    public Timestamp date () {
        Timestamp myDate = Timestamp.from(Instant.now());
        return myDate;
    }
    @GetMapping("/employees")
    private String employee(Model model) {
        LOG.log(Level.INFO, "employees");
       List<Employee> empleados = employeeService.findAll();
        model.addAttribute("empleados", empleados);
        return "employees/list";
    }


    @GetMapping("/employee/create")
    public String createEmployee(Model model){
        LOG.log(Level.INFO,"createEmployee");
        Employee employee = new Employee();
        employee.setCreatedAt(date());
        model.addAttribute("employee", employee);
        List<Profile> profile = profileService.findAll();
        model.addAttribute("profile",profile);
        List<DocumentType> documentTypes = documentTypeService.findAll();
        model.addAttribute("documentTypes", documentTypes);
        List<Enterprise> enterprise = enterpriseService.findAll();
        model.addAttribute("enterprise",enterprise);
        return "/employees/employee";
    }

    @PostMapping("/employee/save")
    public String saveEmployee(Employee user, Model model){
        LOG.log(Level.INFO, "saveEmployee");
        user.setState(true);
        user.setUpdatedAt(date());
        System.out.println(user.toString());
        user = employeeService.createEmployee(user);
        return "redirect:/employees";
    }

    @RequestMapping(value = "/employee/edit/{id}", method = RequestMethod.GET)
    public  String editEmployee(@PathVariable("id")long idEmployee, Model model){
        LOG.log(Level.INFO, "editEmployee");
        Employee employee = employeeService.findById(idEmployee);
        model.addAttribute("employee", employee);
        List<DocumentType> documentTypes = documentTypeService.findAll();
        model.addAttribute("documentTypes", documentTypes);
        List<Enterprise> enterprise = enterpriseService.findAll();
        model.addAttribute("enterprise",enterprise);
        List<Profile> profile = profileService.findAll();
        model.addAttribute("profile",profile);
        return "/employees/employee";
    }

    @RequestMapping(value = "/employee/delete/{id}", method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable("id") long idEmployee, Model modelo) {
        LOG.log(Level.INFO, "deleteEmployee");
        //employeeService.deleteEmployee(id);
        Employee employee = employeeService.findById(idEmployee);
        employee.setState(false);
        employee.setUpdatedAt(date());
        employeeService.updateEmployee(idEmployee,employee);
        return "redirect:/employees";
    }



}
