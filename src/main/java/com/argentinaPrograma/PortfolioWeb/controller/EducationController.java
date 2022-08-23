
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Education;
import com.argentinaPrograma.PortfolioWeb.service.IEducation;
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
@RequestMapping("/education")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app/**"})
public class EducationController {

    @Autowired
    private IEducation educationService;
    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<Education> verEducation(){
        return educationService.verEducation();
    }
    
    //Agregar nuevo
    @PostMapping ("")
    public void agregarEducation(@RequestBody Education education){
        educationService.crearEducation(education);
    }
    
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarEducation(@PathVariable Long id,@RequestBody Education education){
        educationService.modificarEducation(id,education);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarEducation (@PathVariable Long id){
        educationService.borrarEducation(id);
    }
}
