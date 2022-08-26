
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
    private String img_banner;
    private String img_perfil;
    private String name;
    private String titular;
    private String ubication;
    private String country;
    private String about;
    
    public Personal_information(){}

    public Personal_information(Long id, String img_banner, String img_perfil, String name, String titular, String ubication, String country, String about) {
        this.id = id;
        this.img_banner = img_banner;
        this.img_perfil = img_perfil;
        this.name = name;
        this.titular = titular;
        this.ubication = ubication;
        this.country = country;
        
    }
    
}
