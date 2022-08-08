
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Education;
import com.argentinaPrograma.PortfolioWeb.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducation{
    
    @Autowired
    public EducationRepository educationRepository;

    @Override
    public List<Education> verEducation() {
        return educationRepository.findAll();
    }

    @Override
    public void crearEducation(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void modificarEducation(Long id, Education education) {
        Education educationOriginal = buscarEducation(id);
        if(educationOriginal!=null){
            educationOriginal.setImg(education.getImg());
            educationOriginal.setImg_alt(education.getImg_alt());
            educationOriginal.setSchool(education.getSchool());
            educationOriginal.setCareer(education.getCareer());
            educationOriginal.setState(education.getState());
            educationOriginal.setStart(education.getStart());
            educationOriginal.setEnd(education.getEnd());
            educationRepository.save(educationOriginal);
        }
        
    }

    @Override
    public void borrarEducation(Long id) {
        educationRepository.deleteById(id);
    }

    @Override
    public Education buscarEducation(Long id) {
        return educationRepository.findById(id).orElse(null);
    }
    
}
