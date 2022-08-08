
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Skill;
import java.util.List;

public interface ISkill {
    public List<Skill> verSkill();
    public void crearSkill (Skill skill);
    public void modificarSkill(Long id,Skill skill);
    public void borrarSkill (Long id);
    public Skill buscarSkill (Long id);
}
