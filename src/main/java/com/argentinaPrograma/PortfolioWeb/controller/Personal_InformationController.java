
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Personal_information;
import com.argentinaPrograma.PortfolioWeb.service.IPersonal_Information;
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
@RequestMapping("/personal_information")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app/portfolio/personal_information"})
public class Personal_InformationController {
    
    @Autowired
    private IPersonal_Information personal_informationService;

    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<Personal_information> verPersonal_information(){
        return personal_informationService.verPersonal_information();
    }

    //Agregar nuevo
    @PostMapping ("")
    public void agregarPersonal_information(@RequestBody Personal_information personal_info){
        personal_informationService.crearPersonal_information(personal_info);
    }
   
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarPersonal_information(@PathVariable Long id,@RequestBody Personal_information personal_info){
        personal_informationService.modificarPersonal_information(id,personal_info);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarPersonal_information (@PathVariable Long id){
        personal_informationService.borrarPersonal_information(id);
    }
    
}
