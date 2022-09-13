package bigworkers.ingresoegreso.ferreteria.service;


import bigworkers.ingresoegreso.ferreteria.entities.Profile;
import bigworkers.ingresoegreso.ferreteria.repository.IProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements IProfileService{

    @Autowired
    private IProfileRepository profileRepository;
    @Override
    public Profile findById(int id) {
        Optional<Profile> perfil = profileRepository.findById((long)id);
        return perfil.get();
    }

    @Override
    public List<Profile> findAll() {
        List<Profile> perfiles = (List<Profile>) profileRepository.findAll();
        return perfiles;
    }

    @Override
    public Profile createProfile(Profile perfil) {
        Profile newPerfil = profileRepository.save(perfil);
        return newPerfil;
    }

    @Override
    public Profile updateProfile(int id, Profile perfil) {
        Profile putPerfil = profileRepository.save(perfil);
        return putPerfil;
    }

    @Override
    public void deleteProfile(int id) {
        profileRepository.deleteById((long)id);
    }
}
