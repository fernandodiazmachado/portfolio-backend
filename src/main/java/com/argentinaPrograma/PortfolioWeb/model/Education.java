
package com.argentinaPrograma.PortfolioWeb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String img;
    private String img_alt;
    private String school;
    private String career;
    private String state;
    private Long start;
    private Long end;
    
    public Education(){}; 

    public Education(Long id, String img, String img_alt, String school, String career, String state, Long start, Long end) {
        this.id = id;
        this.img = img;
        this.img_alt = img_alt;
        this.school = school;
        this.career = career;
        this.state = state;
        this.start = start;
        this.end = end;
    }
    
    
}
