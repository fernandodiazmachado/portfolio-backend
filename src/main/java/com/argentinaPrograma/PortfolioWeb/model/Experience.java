
package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String img;
    private String img_alt;
    private String company;
    private String position;
    private Long start;
    private Long end;
    
    public Experience(){};

    public Experience(Long id, String img, String img_alt, String company, String position, Long start, Long end) {
        this.id = id;
        this.img = img;
        this.img_alt = img_alt;
        this.company = company;
        this.position = position;
        this.start = start;
        this.end = end;
    }
    
    
    
}
