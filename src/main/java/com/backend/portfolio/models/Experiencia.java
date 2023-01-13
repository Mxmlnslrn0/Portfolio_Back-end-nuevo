package com.backend.portfolio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String empleoExp;
    private String puestoExp;
    private String periodo_unoExp;
    private String periodo_dosExp;
    private String descripExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String empleoExp, String puestoExp, String periodo_unoExp, String periodo_dosExp, String descripExp, String imgExp) {
        this.idExp = idExp;
        this.empleoExp = empleoExp;
        this.puestoExp = puestoExp;
        this.periodo_unoExp = periodo_unoExp;
        this.periodo_dosExp = periodo_dosExp;
        this.descripExp = descripExp;
        this.imgExp = imgExp;
    }

    
    
    

    
}
