
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.About_me;
import com.argentinaPrograma.PortfolioWeb.service.IAbout_me;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about_me")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app"})
public class About_meController {
    
    @Autowired
    private IAbout_me about_meService;

    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<About_me> verPersonal_information(){
        return about_meService.verAbout_me();
    }

    //Agregar nuevo
    @PostMapping ("")
    public void agregarAbout_me(@RequestBody About_me about_me){
        about_meService.crearAbout_me(about_me);
    }
   
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarAbout_me(@PathVariable Long id,@RequestBody About_me about_me){
        about_meService.modificarAbout_me(id,about_me);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarAbout_me (@PathVariable Long id){
        about_meService.borrarAbout_me(id);
    }
    
}
