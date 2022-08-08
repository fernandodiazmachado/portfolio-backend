
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Skill_Type;
import com.argentinaPrograma.PortfolioWeb.repository.Skill_TypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Skill_TypeService implements ISkill_Type{

    @Autowired
    public Skill_TypeRepository skill_TypeRepository;
    
    @Override
    public List<Skill_Type> verSkill_Type() {
        return skill_TypeRepository.findAll();
    }

    @Override
    public void crearSkill_Type(Skill_Type skill_Type) {
        skill_TypeRepository.save(skill_Type);
    }

    @Override
    public void modificarSkill_Type(Long id, Skill_Type skill_Type) {
        Skill_Type skill_TypeOriginal = buscarSkill_Type(id);
        if(skill_TypeOriginal!=null){
            skill_TypeOriginal.setName(skill_Type.getName());
            skill_TypeRepository.save(skill_TypeOriginal);
        }
    }

    @Override
    public void borrarSkill_Type(Long id) {
        skill_TypeRepository.deleteById(id);
    }

    @Override
    public Skill_Type buscarSkill_Type(Long id) {
        return skill_TypeRepository.findById(id).orElse(null);
    }
    
}
