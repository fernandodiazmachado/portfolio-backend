
package com.argentinaPrograma.PortfolioWeb.controller;

import com.argentinaPrograma.PortfolioWeb.model.Proyect;
import com.argentinaPrograma.PortfolioWeb.service.IProyect;
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
@RequestMapping("/proyect")
@CrossOrigin(origins={"http://localhost:4200","https://diaz-machado.web.app", "https://diaz-machado.firebaseapp.com"})
public class ProyectController {

    @Autowired
    private IProyect proyectService;
    
    // Traer todos
    @GetMapping("")
    @ResponseBody
    public List<Proyect> verProyect(){
        return proyectService.verProyect();
    }
    
    //Agregar nuevo
    @PostMapping ("")
    public void agregarProyect(@RequestBody Proyect proyect){
        proyectService.crearProyect(proyect);
    }
    
    //Modificar uno
    @PutMapping("/{id}")
    public void modificarProyect(@PathVariable Long id,@RequestBody Proyect proyect){
        proyectService.modificarProyect(id,proyect);
    }
    
    //Eliminar
    @DeleteMapping("/{id}")
    public void borrarProyect (@PathVariable Long id){
        proyectService.borrarProyect(id);
    }
}
