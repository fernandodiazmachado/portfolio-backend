
package com.argentinaPrograma.PortfolioWeb.repository;


import com.argentinaPrograma.PortfolioWeb.model.About_me;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface About_meRepository extends JpaRepository<About_me,Long>{
    
}
