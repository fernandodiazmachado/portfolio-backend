
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Skill;
import com.argentinaPrograma.PortfolioWeb.service.ISkill;
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
@RequestMapping("/skills")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app", "https://diaz-machado.firebaseapp.com"})
public class SkillController {

    @Autowired
    private ISkill skillService;
    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<Skill> verSkill(){
        return skillService.verSkill();
    }
    
    //Agregar nuevo
    @PostMapping ("")
    public void agregarSkill(@RequestBody Skill skill){
        skillService.crearSkill(skill);
    }
    
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarSkill(@PathVariable Long id,@RequestBody Skill skill){
        skillService.modificarSkill(id,skill);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarSkill (@PathVariable Long id){
        skillService.borrarSkill(id);
    }
}
