
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String link;
    private String img;
    private String img_alt;

    
    public Proyect(){}; 

    public Proyect(Long id, String name, String description, String link, String img, String img_alt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
        this.img = img;
        this.img_alt = img_alt;
    }

    
}
