package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Employee;


import java.util.List;

public interface IEmployeeService {

     Employee findById(long idEmployee);

     List<Employee> findAll();

     Employee createEmployee( Employee employee);

     Employee updateEmployee(long idEmployee, Employee employee);

    void deleteEmployee(long idEmployee);
}
