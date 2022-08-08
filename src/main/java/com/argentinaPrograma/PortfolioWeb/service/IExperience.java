
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Experience;
import java.util.List;

public interface IExperience {
    public List<Experience> verExperience();
    public void crearExperience (Experience experience);
    public void modificarExperience(Long id,Experience experience);
    public void borrarExperience (Long id);
    public Experience buscarExperience (Long id);
}
