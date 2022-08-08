
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Personal_information;
import com.argentinaPrograma.PortfolioWeb.repository.Personal_informationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Personal_InformationService implements IPersonal_Information{
    
    @Autowired
    public Personal_informationRepository personal_informationRepo;
    
    @Override
    public List<Personal_information> verPersonal_information() {
        return personal_informationRepo.findAll();
    }

    @Override
    public void crearPersonal_information(Personal_information personal_information) {
        personal_informationRepo.save(personal_information);
    }

    @Override
    public void borrarPersonal_information(Long id) {
        personal_informationRepo.deleteById(id);
    }

    @Override
    public Personal_information buscarPersonal_information(Long id) {
        return personal_informationRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersonal_information(Long id,Personal_information personal_information) {
        Personal_information personal_informationOriginal = buscarPersonal_information(id);
        if (personal_informationOriginal!=null){
            personal_informationOriginal.setName(personal_information.getName());
            personal_informationOriginal.setPosition(personal_information.getPosition());
            personal_informationOriginal.setUbication(personal_information.getUbication());
            personal_informationOriginal.setAbout(personal_information.getAbout());
            personal_informationRepo.save(personal_informationOriginal);
        }
    }
    
}
