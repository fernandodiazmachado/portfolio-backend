
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.About_me;
import com.argentinaPrograma.PortfolioWeb.repository.About_meRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class About_meService implements IAbout_me{
    
    @Autowired
    public About_meRepository about_meRepo;

    @Override
    public List<About_me> verAbout_me() {
        return about_meRepo.findAll();
    }

    @Override
    public void crearAbout_me(About_me about_me) {
        about_meRepo.save(about_me);
    }

    @Override
    public void borrarAbout_me(Long id) {
        about_meRepo.deleteById(id);
    }

    @Override
    public About_me buscarAbout_me(Long id) {
        return about_meRepo.findById(id).orElse(null);
    }
    
   @Override
    public void modificarAbout_me(Long id, About_me about_me) {
        About_me about_meOriginal = buscarAbout_me(id);
        if(about_meOriginal!=null){
            about_meOriginal.setDescription(about_me.getDescription());
            about_meRepo.save(about_meOriginal);
        }
    }
    
}
