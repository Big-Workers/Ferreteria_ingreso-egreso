package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public interface IProfileService {

    public Profile findById(long id);

    public List<Profile> findAll();

    public Profile createProfile(Profile perfil);

    public Profile updateProfile(long id,Profile perfil);

    public void deleteProfile(long id);
}
