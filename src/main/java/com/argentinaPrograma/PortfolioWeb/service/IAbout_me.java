
package com.argentinaPrograma.PortfolioWeb.service;

import com.argentinaPrograma.PortfolioWeb.model.About_me;

import java.util.List;


public interface IAbout_me {
    
    public List<About_me> verAbout_me();
    public void crearAbout_me (About_me about_me);
    public void modificarAbout_me(Long id,About_me about_me);
    public void borrarAbout_me (Long id);
    public About_me buscarAbout_me (Long id);
}
