package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.FerreteriaApplication;
import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EnterpriseRestController {
    @Autowired
    private FerreteriaApplication.IEnterpriseService EnterpriseService;


    @GetMapping("/enterprise/{id}")
    public Enterprise findById(@PathVariable Long id){
        return EnterpriseService.findById(id);
    }

    @GetMapping("/enterprise")
    public List<Enterprise> findAll(){
        return EnterpriseService.findAll();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise empresa){
        return EnterpriseService.createEnterprise(empresa);
    }

    @PutMapping("/enterprise/{id}")
    public Enterprise updateEnterprise(@PathVariable long id,@RequestBody Enterprise empresa){
        return EnterpriseService.updateEnterprise(id, empresa);
    }

    @DeleteMapping("/enterprise/{id}")
     public void deleteEnterprise(@PathVariable long id){
        EnterpriseService.deleteEnterprise(id);

     }
}

