package com.backend.portfolio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHab;
    private String nombreHab;
    private String porcentajeHab;

    public Habilidades() {
    }

    public Habilidades(Long idHab, String nombreHab, String porcentajeHab) {
        this.idHab = idHab;
        this.nombreHab = nombreHab;
        this.porcentajeHab = porcentajeHab;
    }
    
    
    
}
