
package com.argentinaPrograma.PortfolioWeb.repository;


import com.argentinaPrograma.PortfolioWeb.model.Personal_information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Personal_informationRepository extends JpaRepository<Personal_information,Long>{
    
}
