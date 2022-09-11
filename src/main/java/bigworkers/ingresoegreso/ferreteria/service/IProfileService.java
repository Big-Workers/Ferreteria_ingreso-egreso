package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entities.Profile;

import java.util.List;

public interface IProfileService {

    public Profile findById(long id);

    public List<Profile> findAll();

    public Profile createProfile(Profile perfil);

    public Profile updateProfile(long id,Profile perfil);

    public void deleteProfile(long id);
}
