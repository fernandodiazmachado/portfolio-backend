
package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_skills_type;
    private String name;
    private String progress;

    
    public Skill(){}; 

    public Skill(Long id, Long id_skills_type, String name, String progress) {
        this.id = id;
        this.id_skills_type = id_skills_type;
        this.name = name;
        this.progress = progress;
    }
 
}
