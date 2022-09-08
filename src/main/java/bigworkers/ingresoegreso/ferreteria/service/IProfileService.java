package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public interface IProfileService {

    public Profile fineById(@PathVariable long id);

    List<Profile> perfil = new ArrayList<Profile>();

    public Profile createProfile(@RequestBody Profile perfil);

    public Profile updateProfile(@PathVariable long id, @RequestBody Profile perfil);

    public void deleteProfile(long id);
}
