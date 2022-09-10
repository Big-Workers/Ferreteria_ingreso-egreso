package bigworkers.ingresoegreso.ferreteria.Services;

import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEnterpriseService {

    public Enterprise findById(Long id);
    public List<Enterprise> findAll();
    public Enterprise createEnterprise(Enterprise empresa);
    public Enterprise updateEnterprise(long id, Enterprise empresa);
    public void deleteEnterprise(long id);

    }
