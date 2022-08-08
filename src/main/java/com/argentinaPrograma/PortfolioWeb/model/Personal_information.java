
package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Personal_information {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String position;
    private String ubication;
    private String about;
    
    public Personal_information(){}
    
    public Personal_information(Long id, String name, String position, String ubication, String about){
        this.id = id;
        this.name = name;
        this.position = position;
        this.ubication = ubication;
        this.about = about;
    }
    
}
