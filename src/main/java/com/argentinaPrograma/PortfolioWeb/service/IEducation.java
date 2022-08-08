
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Education;
import java.util.List;

public interface IEducation {
    public List<Education> verEducation();
    public void crearEducation (Education education);
    public void modificarEducation(Long id,Education education);
    public void borrarEducation (Long id);
    public Education buscarEducation (Long id);
}
