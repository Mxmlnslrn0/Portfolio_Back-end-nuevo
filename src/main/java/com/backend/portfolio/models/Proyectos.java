package com.backend.portfolio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPro;
    private String nombrePro;
    private String descripPro;

    public Proyectos() {
    }

    public Proyectos(Long idPro, String nombrePro, String descripPro) {
        this.idPro = idPro;
        this.nombrePro = nombrePro;
        this.descripPro = descripPro;
    }

    

    

    
    
    
}
