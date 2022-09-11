package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.FerreteriaApplication;
import bigworkers.ingresoegreso.ferreteria.entity.Employee;
import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import bigworkers.ingresoegreso.ferreteria.entity.Transaction;
import bigworkers.ingresoegreso.ferreteria.repository.IEnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class EnterpriseService implements FerreteriaApplication.IEnterpriseService {
    @Autowired
    private IEnterpriseRepository EnterpriseRepository;
    @Override
    public Enterprise findById(Long id) {
        Optional<Enterprise> empresa = EnterpriseRepository.findById(id);
        return empresa.get();
    }

    @Override
    public List<Enterprise> findAll() {
        List<Enterprise> empresas = (List<Enterprise>) EnterpriseRepository.findAll();
        return empresas;
    }

    @Override
    public Enterprise createEnterprise(Enterprise empresa) {
        Enterprise newEmpresa = EnterpriseRepository.save(empresa);
        return newEmpresa;
    }

    @Override
    public Enterprise updateEnterprise(long id, Enterprise empresa) {
        Enterprise putEmpresa = EnterpriseRepository.save(empresa);
        return putEmpresa;
    }

    @Override
    public void deleteEnterprise(long id) {
        EnterpriseRepository.deleteById(id);
    }
}
