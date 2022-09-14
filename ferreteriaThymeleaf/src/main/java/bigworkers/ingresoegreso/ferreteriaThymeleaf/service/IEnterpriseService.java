package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;



import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Enterprise;

import java.util.List;

public interface IEnterpriseService {

    public Enterprise findById(int id);

    public List<Enterprise> findAll();

    public Enterprise createEnterprise(Enterprise empresa);

    public Enterprise updateEnterprise(int id, Enterprise empresa);

    public void deleteEnterprise(int id);
}
