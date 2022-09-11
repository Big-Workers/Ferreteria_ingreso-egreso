package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IEnterpriseService {

    public Enterprise findById(Long id);

    public List<Enterprise> findAll();

    public Enterprise createEnterprise(Enterprise empresa);

    public Enterprise updateEnterprise(long id, Enterprise empresa);

    public void deleteEnterprise(long id);
}
