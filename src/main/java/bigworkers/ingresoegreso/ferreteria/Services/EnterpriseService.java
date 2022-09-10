package bigworkers.ingresoegreso.ferreteria.Services;

import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EnterpriseService implements IEnterpriseService {
    @Override
    public Enterprise findById(Long id) {
        Enterprise newEmpresa = new Enterprise();
        newEmpresa.setIdEnterprise(id);
        newEmpresa.setName("la fortuna");
        newEmpresa.setNit("12345");
        newEmpresa.setAddress("Cra 24 No 16-15");
        newEmpresa.setPhone("43345555");
        newEmpresa.setTransaction(new Transaction());
        newEmpresa.setEmployee(new Employee());
        newEmpresa.setState(true);
        newEmpresa.setPhone("32135687");
        return newEmpresa;
    }

    @Override
    public List<Enterprise> findAll() {
        List<Enterprise> empresa= new ArrayList<>();
        Enterprise newEmpresa1 = new Enterprise();
        Transaction transaction=new Transaction();
        Employee employee = new Employee();
        newEmpresa1.setIdEnterprise(1);
        newEmpresa1.setAddress("Cra 24 No 16-15");
        newEmpresa1.setNit("12345");
        newEmpresa1.setName("la fortuna");
        newEmpresa1.setPhone("32135687");
        newEmpresa1.setState(true);
        newEmpresa1.setEmployee(employee);
        newEmpresa1.setTransaction(transaction);
        empresa.add(newEmpresa1);
        Enterprise newEmpresa2 = new Enterprise();
        newEmpresa2.setIdEnterprise(2);
        newEmpresa2.setAddress("Cra 12 No 17 -24");
        newEmpresa2.setNit("45678");
        newEmpresa2.setName("la esperanza");
        newEmpresa2.setPhone("346785457");
        newEmpresa2.setState(false);
        newEmpresa2.setTransaction(transaction);
        newEmpresa2.setEmployee(employee);
        empresa.add(newEmpresa2);
        return empresa;
    }

    @Override
    public Enterprise createEnterprise(Enterprise empresa) {
        Enterprise newEmpresa = new Enterprise();
        newEmpresa.setIdEnterprise(4);
        newEmpresa.setEmployee(empresa.getEmployee());
        newEmpresa.setState(empresa.isState());
        newEmpresa.setTransaction(empresa.getTransaction());
        newEmpresa.setAddress(empresa.getAddress());
        newEmpresa.setNit(empresa.getNit());
        newEmpresa.setName(empresa.getName());
        newEmpresa.setPhone(empresa.getPhone());
        return newEmpresa;
    }

    @Override
    public Enterprise updateEnterprise(long id, Enterprise empresa) {
        Enterprise newEmpresa = findById(id);
        newEmpresa.setEmployee(empresa.getEmployee());
        newEmpresa.setState(empresa.isState());
        newEmpresa.setTransaction(empresa.getTransaction());
        newEmpresa.setAddress(empresa.getAddress());
        newEmpresa.setNit(empresa.getNit());
        newEmpresa.setName(empresa.getName());
        newEmpresa.setPhone(empresa.getPhone());
        return newEmpresa;
    }

    @Override
    public void deleteEnterprise(long id) {
        Enterprise deleteEmpresa = findById(id);
    }
}
