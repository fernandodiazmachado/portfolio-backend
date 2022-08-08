
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Skill_Type;
import java.util.List;

public interface ISkill_Type {
    public List<Skill_Type> verSkill_Type();
    public void crearSkill_Type (Skill_Type skill_Type);
    public void modificarSkill_Type(Long id,Skill_Type skill_Type);
    public void borrarSkill_Type (Long id);
    public Skill_Type buscarSkill_Type (Long id);
}
