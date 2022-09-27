package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Profile;
import java.util.List;

public interface IProfileService {

    public Profile findById(long idProfile);

    public List<Profile> findAll();

    public Profile createProfile(Profile perfil);

    public Profile updateProfile(long idProfile,Profile perfil);

    public void deleteProfile(long idProfile);
}
