
package com.argentinaPrograma.PortfolioWeb.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill_Type {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Skill_Type(){}; 

    public Skill_Type(Long id, String name) {
        this.id = id;
        this.name = name;

    }

    
}
