
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Proyect;
import com.argentinaPrograma.PortfolioWeb.repository.ProyectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectService implements IProyect {
    
    @Autowired
    public ProyectRepository proyectRepository;

    @Override
    public List<Proyect> verProyect() {
        return proyectRepository.findAll();
    }

    @Override
    public void crearProyect(Proyect proyect) {
        proyectRepository.save(proyect);
    }

    @Override
    public void modificarProyect(Long id, Proyect proyect) {
        Proyect proyectOriginal = buscarProyect(id);
        if(proyectOriginal!=null){
            proyectOriginal.setName(proyect.getName());
            proyectOriginal.setTarget(proyect.getTarget());
            proyectOriginal.setId(proyect.getId());
            proyectOriginal.setDescription(proyect.getDescription());
            proyectOriginal.setLink(proyect.getLink());
            proyectRepository.save(proyectOriginal);
        }
    }

    @Override
    public void borrarProyect(Long id) {
        proyectRepository.deleteById(id);
    }

    @Override
    public Proyect buscarProyect(Long id) {
        return proyectRepository.findById(id).orElse(null);
    }
    
}
