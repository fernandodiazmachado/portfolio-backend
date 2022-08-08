
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Personal_information;
import java.util.List;


public interface IPersonal_Information {
    
    public List<Personal_information> verPersonal_information();
    public void crearPersonal_information (Personal_information personal_information);
    public void modificarPersonal_information(Long id,Personal_information personal_information);
    public void borrarPersonal_information (Long id);
    public Personal_information buscarPersonal_information (Long id);
}
