package bigworkers.ingresoegreso.ferreteria.controller;

import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    @GetMapping("/Profile/{idProfile}")
    public Profile findById(@PathVariable long idProfile) {
        Profile controlProfile = new Profile();
        controlProfile.setIdProfile(idProfile);
        controlProfile.setName(controlProfile.getName());
        controlProfile.setImage(controlProfile.getImage());
        controlProfile.setPassword(controlProfile.getPassword());
        controlProfile.setState(true);
        return controlProfile;
    }

    @GetMapping("/profile")
    public List<Profile> findAll() {
        List<Profile> listProfile = new ArrayList<Profile>();
        Profile profile1 = new Profile();
        profile1.setIdProfile(1);
        profile1.setName("Carlos");
        profile1.setImage(profile1.getImage());
        profile1.setPassword("2222");
        profile1.setState(true);
        return listProfile;
    }

    @PostMapping("/profile")
    public Profile CreateProfile(@RequestBody Profile profile) {
        Profile newProfile = new Profile();
        newProfile.setIdProfile(3);
        newProfile.setName(newProfile.getName());
        newProfile.setImage(newProfile.getImage());
        newProfile.setPassword(newProfile.getPassword());
        newProfile.setState(newProfile.isState());
        return newProfile;
    }

    @PutMapping("/profile/{idProfile}")
    public Profile updateProfile(@PathVariable long idDocumentType, @RequestBody Profile profile) {
        Profile putProfile = findById(idDocumentType);
        putProfile.setIdProfile(idDocumentType);
        putProfile.setName(putProfile.getName());
        putProfile.setImage(putProfile.getImage());
        putProfile.setPassword(putProfile.getPassword());
        putProfile.setState(profile.isState());
        return putProfile;
    }

    @DeleteMapping("/profile/{idProfile}")
    public void deleteRole(@PathVariable long idProfile){
        Profile deleteProfile = findById(idProfile);
    }


}