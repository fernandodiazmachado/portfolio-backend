
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Experience;
import com.argentinaPrograma.PortfolioWeb.repository.ExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperience{
    
    @Autowired
    public ExperienceRepository experienceRepo;

    @Override
    public List<Experience> verExperience() {
        return experienceRepo.findAll();
    }

    @Override
    public void crearExperience(Experience experience) {
        experienceRepo.save(experience);
    }

    @Override
    public void modificarExperience(Long id, Experience experience) {
        Experience experienceOriginal = buscarExperience(id);
        if(experienceOriginal!=null){
            experienceOriginal.setImg(experience.getImg());
            experienceOriginal.setImg_alt(experience.getImg_alt());
            experienceOriginal.setCompany(experience.getCompany());
            experienceOriginal.setPosition(experience.getPosition());
            experienceOriginal.setStart(experience.getStart());
            experienceOriginal.setEnd(experience.getEnd());
            experienceRepo.save(experienceOriginal);
        }
    }

    @Override
    public void borrarExperience(Long id) {
        experienceRepo.deleteById(id);
    }

    @Override
    public Experience buscarExperience(Long id) {
        return experienceRepo.findById(id).orElse(null);
    }
    
    
    
}
