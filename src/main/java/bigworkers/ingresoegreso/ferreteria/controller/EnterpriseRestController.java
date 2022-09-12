package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.FerreteriaApplication;
import bigworkers.ingresoegreso.ferreteria.entities.Enterprise;
import bigworkers.ingresoegreso.ferreteria.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EnterpriseRestController {
    @Autowired
    private IEnterpriseService enterpriseService;
    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable int id){
        return enterpriseService.findById(id);
    }

    @GetMapping("/enterprise")
    public List<Enterprise> findAll(){
        return enterpriseService.findAll();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise empresa){
        return enterpriseService.createEnterprise(empresa);
    }

    @PutMapping("/enterprise/{id}")
    public Enterprise updateEnterprise(@PathVariable int id,@RequestBody Enterprise empresa){
        return enterpriseService.updateEnterprise(id, empresa);
    }

    @DeleteMapping("/enterprise/{id}")
     public void deleteEnterprise(@PathVariable int id){
        enterpriseService.deleteEnterprise(id);

     }
}

