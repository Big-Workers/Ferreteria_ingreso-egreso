package bigworkers.ingresoegreso.ferreteria.service;

import bigworkers.ingresoegreso.ferreteria.entity.Profile;

public class ProfileService implements IProfileService{

    @Override
    public Profile fineById(long id) {
        Profile perfil = new Profile();
        perfil.setIdProfile(id);
        perfil.setName("diego");
        perfil.setPassword("12345");
        perfil.setImage("foto");
        perfil.setState(true);
        return perfil;
    }

    @Override
    public Profile createProfile(Profile perfil) {
        return null;
    }

    @Override
    public Profile updateProfile(long id, Profile perfil) {
        return null;
    }

    @Override
    public void deleteProfile(long id) {

    }
}
