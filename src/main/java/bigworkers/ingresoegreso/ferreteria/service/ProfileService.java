package bigworkers.ingresoegreso.ferreteria.service;


import bigworkers.ingresoegreso.ferreteria.entity.Profile;

import java.util.ArrayList;
import java.util.List;

public class ProfileService implements IProfileService{


    @Override
    public Profile findById(long id) {
        Profile Perfiles = new Profile();
        Perfiles.setIdProfile(1);
        Perfiles.setName("ANDRES CAMILO");
        Perfiles.setPassword("124356");
        Perfiles.setImage("imagen");
        Perfiles.setState(true);
        return Perfiles;
    }

    @Override
    public Profile findAll() {
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

    @Override
    public Profile createProfile(Profile perfil) {
        Profile newPerfil = new Profile();
        newPerfil.setIdProfile(newPerfil.getIdProfile());
        newPerfil.setName(newPerfil.getName());
        newPerfil.setPassword(newPerfil.getPassword());
        newPerfil.setImage(newPerfil.getImage());
        newPerfil.setState(newPerfil.isState());
        return newPerfil;
    }

    @Override
    public Profile updateProfile(long id, Profile perfil) {
        Profile putProfile = findById(id);
        putProfile.setIdProfile(putProfile.getIdProfile());
        putProfile.setName(putProfile.getName());
        putProfile.setPassword(putProfile.getPassword());
        putProfile.setImage(perfil.getImage());
        putProfile.setState(perfil.isState());
        return putProfile;
    }

    @Override
    public void deleteProfile(long id) {
        Profile deleteProfile = findById(id);
    }
}
