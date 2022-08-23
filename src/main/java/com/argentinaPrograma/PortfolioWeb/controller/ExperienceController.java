
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Experience;
import com.argentinaPrograma.PortfolioWeb.service.IExperience;
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
@RequestMapping("/experience")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app"})
public class ExperienceController {

    @Autowired
    private IExperience experienceService;
    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<Experience> verExperience(){
        return experienceService.verExperience();
    }
    
    //Agregar nuevo
    @PostMapping ("")
    public void agregarExperience(@RequestBody Experience experience){
        experienceService.crearExperience(experience);
    }
    
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarExperience(@PathVariable Long id,@RequestBody Experience experience){
        experienceService.modificarExperience(id,experience);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarExperience (@PathVariable Long id){
        experienceService.borrarExperience(id);
    }
}
