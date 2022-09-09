package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.DocumentType;
import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Override
    public Employee findById(long idEmployee) {
        Employee employee1 = new Employee();
        employee1.setIdEmployee(1);
        employee1.setDocumentType("CC");
        employee1.setDocumentNumber("24433545");
        employee1.setName("Manuel");
        employee1.setSurnames("Rodriguez");
        employee1.setEmail("manuel@gmail.com");
        employee1.setAddress("Cr 22 #14.23");
        employee1.setProfile("Manuel22");
        employee1.setRole("Operator");
        employee1.setState(true);
        DocumentType documentType1 = new DocumentType();
        documentType1.setIdDocumentType(1);
        documentType1.setDescription("Cedula de ciudadania");
        documentType1.setInitials("CC");
        documentType1.setState(true);
        return employee1;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employee = new ArrayList<Employee>();
        Employee employee1 = new Employee();
        employee1.setIdEmployee(2);
        employee1.setDocumentType("CC");
        employee1.setDocumentNumber("24433545");
        employee1.setName("Manuel");
        employee1.setSurnames("Rodriguez");
        employee1.setEmail("manuel@gmail.com");
        employee1.setAddress("Cr 22 #14.23");
        employee1.setProfile("Manuel22");
        employee1.setRole("Operator");
        employee1.setState(true);
        DocumentType documentType = new DocumentType();
        documentType.setIdDocumentType(1);
        documentType.setDescription("Cedula de ciudadania");
        documentType.setInitials("CC");
        documentType.setState(true);
        Employee employee2 = new Employee();
        employee2.setIdEmployee(2);
        employee2.setDocumentType("CC");
        employee2.setDocumentNumber("24433545");
        employee2.setName("Manuel");
        employee2.setSurnames("Rodriguez");
        employee2.setEmail("manuel@gmail.com");
        employee2.setAddress("Cr 22 #14.23");
        employee2.setProfile("Manuel22");
        employee2.setRole("Operator");
        employee2.setState(true);
        documentType.setIdDocumentType(1);
        documentType.setDescription("Cedula de ciudadania");
        documentType.setInitials("CC");
        documentType.setState(true);
        return employee;
    }

    @Override
    public Employee CreateEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        employee.setIdEmployee(1);
        employee.setName("Manuel");
        employee.setSurnames("Rodriguez");
        employee.setDocumentType("CC");
        employee.setDocumentNumber("34354656");
        employee.setEmail("manuel@gmail.com");
        employee.setState(true);
        DocumentType documentType = new DocumentType();
        documentType.setIdDocumentType(1);
        documentType.setDescription("cedula de ciudadania");
        documentType.setState(true);
        return newEmployee;
    }

    @Override
    public Employee updateEmployee(long idEmployee, Employee employee) {
        Employee putEmployee = findById(idEmployee);
        Employee employee1 = new Employee();
        employee1.setIdEmployee(idEmployee);
        employee1.setName("Manuel");
        employee1.setSurnames("Rodriguez");
        employee1.setDocumentType("CC");
        employee1.setDocumentNumber("34354656");
        employee1.setEmail("manuel@gmail.com");
        employee.setState(true);
        DocumentType documentType = new DocumentType();
        documentType.setIdDocumentType(1);
        documentType.setDescription("Cedula de ciudadania");
        documentType.setState(true);
        return putEmployee;
    }

    @Override
    public void deleteEmployee(long idEmployee) {
        Employee deleteEmployee = findById(idEmployee);
    }

}