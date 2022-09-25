package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;



import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Employee;

import java.util.List;

public interface IEmployeeService {

    Employee findById(long idEmployee);

    Employee findById(int idEmployee);

     List<Employee> findAll();

     Employee createEmployee( Employee employee);

     Employee updateEmployee( int idEmployee, Employee employee);

    Employee updateEmployee(long idEmployee, Employee employee);

    void deleteEmployee(int idEmployee);

    void deleteEmployee(long idEmployee);
}
