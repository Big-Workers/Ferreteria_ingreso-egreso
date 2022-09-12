package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Employee;
import bigworkers.ingresoegreso.ferreteria.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public Employee findById(int id) {
        Optional<Employee> empleado = employeeRepository.findById((long)id);
        return empleado.get();
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> empleados = (List<Employee>) employeeRepository.findAll();
        return empleados;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmpleado = employeeRepository.save(employee);
        return newEmpleado;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee putEmployee = employeeRepository.save(employee);
        return putEmployee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById((long)id);
    }

}