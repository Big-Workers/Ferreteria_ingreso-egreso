package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Api")
public class EmployeeRestController {

    @Autowired
    private IEmployeeService EmployeeService;


    @GetMapping("/employee/{idUser}")
    public Employee findById(@PathVariable long idEmployee){
        return EmployeeService.findById(idEmployee) ;
    }

    @GetMapping("/employee/")
    public List<Employee> findAll(){
        return EmployeeService.findAll();
    }

    @PostMapping("/employee")
    public Employee CreateEmployee(@RequestBody Employee employee){
        return employee;
    }

    @PutMapping("/documentType/{iDocumentType}")
    public Employee updateEmployee(@PathVariable long idEmployee, @RequestBody Employee employee){
        return employee;
    }

    @DeleteMapping("/documentType/{idDocumentType}")
    public void deleteRole(@PathVariable long idDocumentType){
        Employee deleteEmployee = findById(1);
    }




}
