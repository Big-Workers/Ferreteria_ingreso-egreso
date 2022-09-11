package bigworkers.ingresoegreso.ferreteria.service;


import bigworkers.ingresoegreso.ferreteria.entity.Enterprise;
import bigworkers.ingresoegreso.ferreteria.entity.Profile;
import bigworkers.ingresoegreso.ferreteria.repository.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements IProfileService{

    @Autowired
    private IProfileRepository ProfileRepository;
    @Override
    public Profile findById(long id) {
        Optional<Profile> perfil = ProfileRepository.findById(id);
        return perfil.get();
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> perfiles = (List<Profile>) ProfileRepository.findAll();
        return perfiles;
    }

    @Override
    public Profile createProfile(Profile perfil) {
        Profile newPerfil = ProfileRepository.save(perfil);
        return newPerfil;
    }

    @Override
    public Profile updateProfile(long id, Profile perfil) {
        Profile putPerfil = ProfileRepository.save(perfil);
        return putPerfil;
    }

    @Override
    public void deleteProfile(long id) {
        ProfileRepository.deleteById(id);
    }
}
