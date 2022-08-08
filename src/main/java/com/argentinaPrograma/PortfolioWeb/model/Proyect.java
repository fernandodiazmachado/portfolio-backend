
package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyect {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proyect;
    private String name;
    private String target;
    private String id;
    private String description;
    private String link;

    
    public Proyect(){}; 

    public Proyect(Long id_proyect, String name, String target, String id, String description, String link) {
        this.id_proyect = id_proyect;
        this.name = name;
        this.target = target;
        this.id = id;
        this.description = description;
        this.link = link;
    }
}
