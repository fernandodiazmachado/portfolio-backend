
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Skill_Type;
import com.argentinaPrograma.PortfolioWeb.service.ISkill_Type;
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
@RequestMapping("/skill_type")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app"})
public class Skill_TypeController {

    @Autowired
    private ISkill_Type skill_TypeService;
    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<Skill_Type> verSkill_Type(){
        return skill_TypeService.verSkill_Type();
    }
    
    //Agregar nuevo
    @PostMapping ("")
    public void agregarSkill_Type(@RequestBody Skill_Type skill_Type){
        skill_TypeService.crearSkill_Type(skill_Type);
    }
    
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarSkill_Type(@PathVariable Long id,@RequestBody Skill_Type skill_Type){
        skill_TypeService.modificarSkill_Type(id,skill_Type);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarSkill_Type (@PathVariable Long id){
        skill_TypeService.borrarSkill_Type(id);
    }
}
