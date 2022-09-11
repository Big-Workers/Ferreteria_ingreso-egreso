package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Profile;
import java.util.List;

public interface IProfileService {

    public Profile findById(int id);

    public List<Profile> findAll();

    public Profile createProfile(Profile perfil);

    public Profile updateProfile(int id,Profile perfil);

    public void deleteProfile(int id);
}
