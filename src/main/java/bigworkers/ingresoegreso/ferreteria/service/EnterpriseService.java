package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.FerreteriaApplication;
import bigworkers.ingresoegreso.ferreteria.entities.Enterprise;
import bigworkers.ingresoegreso.ferreteria.repository.IEnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EnterpriseService implements FerreteriaApplication.IEnterpriseService {
    @Autowired
    private IEnterpriseRepository enterpriseRepository;
    @Override
    public Enterprise findById(Long id) {
        Optional<Enterprise> empresa = enterpriseRepository.findById(id);
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
    public Enterprise updateEnterprise(long id, Enterprise empresa) {
        Enterprise putEmpresa = enterpriseRepository.save(empresa);
        return putEmpresa;
    }

    @Override
    public void deleteEnterprise(long id) {
        enterpriseRepository.deleteById(id);
    }
}
