package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.DocumentType;
import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import bigworkers.ingresoegreso.ferreteria.entity.Role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Override
    public Employee findById(long idEmployee) {
        Employee employee1 = new Employee();
        DocumentType tipoDocumento = new DocumentType();
        Profile perfil = new Profile();
        employee1.setIdEmployee(idEmployee);
        employee1.setDocumentType(tipoDocumento);
        employee1.setDocumentNumber("24433545");
        employee1.setName("Manuel");
        employee1.setSurnames("Rodriguez");
        employee1.setEmail("manuel@gmail.com");
        employee1.setAddress("Cr 22 #14.23");
        employee1.setProfile(perfil);
        employee1.setRole(Role.Admin);
        employee1.setState(true);
        return employee1;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> empleados = new ArrayList<>();
        Employee employee1 = new Employee();
        DocumentType tipoDocumento = new DocumentType();
        Profile perfil = new Profile();
        employee1.setIdEmployee(1);
        employee1.setDocumentType(tipoDocumento);
        employee1.setDocumentNumber("24433545");
        employee1.setName("Manuel");
        employee1.setSurnames("Rodriguez");
        employee1.setEmail("manuel@gmail.com");
        employee1.setAddress("Cr 22 #14.23");
        employee1.setProfile(perfil);
        employee1.setRole(Role.Admin);
        employee1.setState(true);
        empleados.add(employee1);
        Employee employee2 = new Employee();
        DocumentType tipoDocumento2 = new DocumentType();
        Profile perfil2 = new Profile();
        employee2.setIdEmployee(1);
        employee2.setDocumentType(tipoDocumento2);
        employee2.setDocumentNumber("24433545");
        employee2.setName("Manuel");
        employee2.setSurnames("Rodriguez");
        employee2.setEmail("manuel@gmail.com");
        employee2.setAddress("Cr 22 #14.23");
        employee2.setProfile(perfil2);
        employee2.setRole(Role.Operator);
        employee2.setState(true);
        return empleados;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        newEmployee.setIdEmployee(1);
        newEmployee.setDocumentType(employee.getDocumentType());
        newEmployee.setDocumentNumber(employee.getDocumentNumber());
        newEmployee.setName(employee.getName());
        newEmployee.setSurnames(employee.getSurnames());
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setAddress(employee.getAddress());
        newEmployee.setProfile(employee.getProfile());
        newEmployee.setRole(employee.getRole());
        newEmployee.setState(employee.isState());
        return newEmployee;
    }

    @Override
    public Employee updateEmployee(long idEmployee, Employee employee) {
        Employee newEmployee = findById(idEmployee);
        newEmployee.setDocumentType(employee.getDocumentType());
        newEmployee.setDocumentNumber(employee.getDocumentNumber());
        newEmployee.setName(employee.getName());
        newEmployee.setSurnames(employee.getSurnames());
        newEmployee.setEmail(employee.getEmail());
        newEmployee.setAddress(employee.getAddress());
        newEmployee.setProfile(employee.getProfile());
        newEmployee.setRole(employee.getRole());
        newEmployee.setState(employee.isState());
        return newEmployee;
    }

    @Override
    public void deleteEmployee(long idEmployee) {
        Employee deleteEmployee = findById(idEmployee);
    }

}