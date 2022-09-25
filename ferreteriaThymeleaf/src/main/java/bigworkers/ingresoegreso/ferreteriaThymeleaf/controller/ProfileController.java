package bigworkers.ingresoegreso.ferreteriaThymeleaf.controller;

import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Profile;
import bigworkers.ingresoegreso.ferreteriaThymeleaf.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ProfileController {
    @Autowired
    private IProfileService profileService;

    private final Logger LOG = Logger.getLogger(""+ProfileController.class);

    public Timestamp date () {
        Timestamp myDate = Timestamp.from(Instant.now());
        return myDate;
    }

    @GetMapping("/profile/list")
    public String getListProfile(Model model){
        LOG.log(Level.INFO,"getListProfile");
        List<Profile> profiles = profileService.findAll();
        model.addAttribute("profiles",profiles);
        return "profile/list";
    }

    @GetMapping("/profile/create")
    public String createProfile(Model model) {
        LOG.log(Level.INFO, "createProfile");
        Profile profile = new Profile();
        profile.setCreatedAt(date());
        model.addAttribute("profile", profile);
        return "profile/registration";
    }

    @PostMapping("/profile/save")
    public String saveProfile(Profile profile, Model modelo) {
        LOG.log(Level.INFO, "saveProfile");
        profile.setState(true);
        profile.setUpdatedAt(date());
        profile = profileService.createProfile(profile);
        modelo.addAttribute("profile",profile);
        return "redirect:/employee/create";
    }

    @RequestMapping(value = "/employee/profile/edit/{id}", method = RequestMethod.GET)
    public String editProfile(@PathVariable("id") long id, Model modelo){
        LOG.log(Level.INFO,"editProfile");
        Profile profile  = profileService.findById(id);
        modelo.addAttribute("profile", profile);
        return "profile/registration";
    }

    @RequestMapping(value = "/employee/profile/delete/{id}", method = RequestMethod.GET)
    public String deleteProfile(@PathVariable("id") long id, Model modelo) {
        LOG.log(Level.INFO, "deleteProfile");
        //profileService.deleteProfile(id);
        Profile profile = profileService.findById(id);
        profile.setState(false);
        profile.setUpdatedAt(date());
        profileService.updateProfile(id,profile);
        return "redirect:/profile/list";
    }
}
