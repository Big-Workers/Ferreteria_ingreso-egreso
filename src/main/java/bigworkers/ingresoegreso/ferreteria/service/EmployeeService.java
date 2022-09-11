package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.DocumentType;
import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import bigworkers.ingresoegreso.ferreteria.entity.Role;
import bigworkers.ingresoegreso.ferreteria.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepository EmployeeRepository;
    @Override
    public Employee findById(long id) {
        Optional<Employee> empleado = EmployeeRepository.findById(id);
        return empleado.get();
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> empleados = (List<Employee>) EmployeeRepository.findAll();
        return empleados;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmpleado = EmployeeRepository.save(employee);
        return newEmpleado;
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Employee putEmployee = EmployeeRepository.save(employee);
        return putEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        EmployeeRepository.deleteById(id);
    }

}