package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Employee;


import java.util.List;

public interface IEmployeeService {

     Employee findById( int idEmployee);

     List<Employee> findAll();

     Employee createEmployee( Employee employee);

     Employee updateEmployee( int idEmployee, Employee employee);

    void deleteEmployee(int idEmployee);
}
