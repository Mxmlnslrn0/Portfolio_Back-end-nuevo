package com.backend.portfolio.repository;

import com.backend.portfolio.models.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidades, Long> {
    
}
