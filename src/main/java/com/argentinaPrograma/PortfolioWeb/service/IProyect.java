
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.Proyect;
import java.util.List;

public interface IProyect {
    public List<Proyect> verProyect();
    public void crearProyect (Proyect proyect);
    public void modificarProyect(Long id,Proyect proyect);
    public void borrarProyect (Long id);
    public Proyect buscarProyect (Long id);
}
