
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Skill;
import com.argentinaPrograma.PortfolioWeb.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkill{

    @Autowired
    public SkillRepository skillRepository;
    
    @Override
    public List<Skill> verSkill() {
        return skillRepository.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void modificarSkill(Long id, Skill skill) {
        Skill skillOriginal = buscarSkill(id);
        if(skillOriginal!=null){
            skillOriginal.setId_skills_type(skill.getId_skills_type());
            skillOriginal.setName(skill.getName());
            skillOriginal.setProgress(skill.getProgress());
            skillRepository.save(skillOriginal);
        }
    }

    @Override
    public void borrarSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
}
