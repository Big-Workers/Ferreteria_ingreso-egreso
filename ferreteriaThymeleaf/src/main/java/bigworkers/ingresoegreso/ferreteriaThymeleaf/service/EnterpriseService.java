package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;


import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Enterprise;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.repository.IEnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EnterpriseService implements IEnterpriseService {
    @Autowired
    private IEnterpriseRepository enterpriseRepository;
    @Override
    public Enterprise findById(int id) {
        Optional<Enterprise> empresa = enterpriseRepository.findById((long)id);
        return empresa.get();
    }

    @Override
    public List<Enterprise> findAll() {
        List<Enterprise> empresas = (List<Enterprise>) enterpriseRepository.findAll();
        return empresas;
    }

    @Override
    public Enterprise createEnterprise(Enterprise empresa) {
        Enterprise newEmpresa = enterpriseRepository.save(empresa);
        return newEmpresa;
    }

    @Override
    public Enterprise updateEnterprise(int id, Enterprise empresa) {
        Enterprise putEmpresa = enterpriseRepository.save(empresa);
        return putEmpresa;
    }

    @Override
    public void deleteEnterprise(int id) {
        enterpriseRepository.deleteById((long)id);
    }
}
