package bigworkers.ingresoegreso.ferreteriaThymeleaf.service;



import bigworkers.ingresoegreso.ferreteriaThymeleaf.entities.Profile;

import java.util.List;

public interface IProfileService {

    public Profile findById(int id);

    public List<Profile> findAll();

    public Profile createProfile(Profile perfil);

    public Profile updateProfile(int id,Profile perfil);

    public void deleteProfile(int id);
}
