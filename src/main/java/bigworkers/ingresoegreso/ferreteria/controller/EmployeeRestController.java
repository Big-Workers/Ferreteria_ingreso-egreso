package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private IEmployeeService EmployeeService;


    @GetMapping("/employee/{idUser}")
    public Employee findById(@PathVariable long idUser){
        return EmployeeService.findById(idUser) ;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return EmployeeService.findAll();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return EmployeeService.createEmployee(employee);
    }

    @PutMapping("/employee/{idUser}")
    public Employee updateEmployee(@PathVariable long idUser, @RequestBody Employee employee){
        return EmployeeService.updateEmployee(idUser, employee);
    }

    @DeleteMapping("/employee/{idUser}")
    public void deleteEmployee(@PathVariable long idUser){
        EmployeeService.deleteEmployee(idUser);
    }




}
