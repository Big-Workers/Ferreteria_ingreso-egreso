package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import bigworkers.ingresoegreso.ferreteria.service.IProfileService;
import bigworkers.ingresoegreso.ferreteria.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class ProfileRestController {

    @Autowired
    public IProfileService profileService;

    @GetMapping("/profile/{id}")
    public Profile findById(@PathVariable long id){
        return ProfileService.findById(id);
    }
    public Profile findAll(){
        List<Profile> perfil = new ArrayList<Profile>();
        Profile perfil1 = new Profile();
        perfil1.setIdProfile(1);
        perfil1.setName("andres");
        perfil1.setPassword("3452");
        perfil1.setImage("foto2");
        perfil1.setState(true);
        Profile perfil2 = new Profile();
        perfil2.setIdProfile(1);
        perfil2.setName("andres");
        perfil2.setPassword("3452");
        perfil2.setImage("foto2");
        perfil2.setState(true);
        return perfil1;

    }
    @PostMapping("/profile/")
    public Profile createProfile(@RequestBody Profile perfil){
        Profile newPerfil = new Profile();
        newPerfil.setIdProfile(newPerfil.getIdProfile());
        newPerfil.setName(newPerfil.getName());
        newPerfil.setPassword(newPerfil.getPassword());
        newPerfil.setImage(newPerfil.getImage());
        newPerfil.setState(newPerfil.isState());
        return newPerfil;


    }

    @PutMapping("/profile/{id}")
    public Profile updateProfile(@PathVariable long id, @RequestBody Profile perfil){
        Profile putProfile = fineById(id);
        putProfile.setIdProfile(putProfile.getIdProfile());
        putProfile.setName(putProfile.getName());
        putProfile.setPassword(putProfile.getPassword());
        putProfile.setImage(perfil.getImage());
        putProfile.setState(perfil.isState());
        return putProfile;

    }

    @DeleteMapping("/profile/{id}")
    public void deleteProfile(long id){
        Profile deleteProfile = fineById(id);


    }
}
