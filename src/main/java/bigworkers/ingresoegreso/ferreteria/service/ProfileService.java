package bigworkers.ingresoegreso.ferreteria.service;


import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
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
    public List<Profile> findAll() {
        List<Profile> perfil = new ArrayList<>();
        Profile perfil1 = new Profile();
        perfil1.setIdProfile(1);
        perfil1.setName("andres");
        perfil1.setPassword("3452");
        perfil1.setImage("foto2");
        perfil1.setState(true);
        perfil.add(perfil1);
        Profile perfil2 = new Profile();
        perfil2.setIdProfile(2);
        perfil2.setName("Carlos");
        perfil2.setPassword("1234");
        perfil2.setImage("foto3");
        perfil2.setState(true);
        perfil.add(perfil2);
        return perfil;
    }

    @Override
    public Profile createProfile(Profile perfil) {
        Profile newPerfil = new Profile();
        newPerfil.setIdProfile(perfil.getIdProfile());
        newPerfil.setName(perfil.getName());
        newPerfil.setPassword(perfil.getPassword());
        newPerfil.setImage(perfil.getImage());
        newPerfil.setState(perfil.isState());
        return newPerfil;
    }

    @Override
    public Profile updateProfile(long id, Profile perfil) {
        Profile putProfile = findById(id);
        putProfile.setIdProfile(perfil.getIdProfile());
        putProfile.setName(perfil.getName());
        putProfile.setPassword(perfil.getPassword());
        putProfile.setImage(perfil.getImage());
        putProfile.setState(perfil.isState());
        return putProfile;
    }

    @Override
    public void deleteProfile(long id) {
        Profile deleteProfile = findById(id);
    }
}
