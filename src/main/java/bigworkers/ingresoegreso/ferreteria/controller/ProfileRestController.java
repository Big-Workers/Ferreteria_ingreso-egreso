package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entities.Profile;
import bigworkers.ingresoegreso.ferreteria.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    @Autowired
    public IProfileService ProfileService;

    @GetMapping("/profile/{id}")
    public Profile findById(@PathVariable int id){
        return ProfileService.findById(id);
    }

    @GetMapping("/profile")
    public List<Profile> findAll(){
       return ProfileService.findAll();
    }

    @PostMapping("/profile")
    public Profile createProfile(@RequestBody Profile perfil){
        return ProfileService.createProfile(perfil);
    }

    @PatchMapping("/profile/{id}")
    public Profile updateProfile(@PathVariable int id, @RequestBody Profile perfil){
        return ProfileService.updateProfile(id, perfil);
    }

    @DeleteMapping("/profile/{id}")
    public void deleteProfile(@PathVariable int id){
        ProfileService.deleteProfile(id);
    }
}
