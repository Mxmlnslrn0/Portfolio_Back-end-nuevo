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
    private int periodoExp;
    private String descripExp;

    public Experiencia() {
    }
    
    public Experiencia(Long idExp, String empleoExp, String puestoExp, int periodoExp, String descripExp) {
        this.idExp = idExp;
        this.empleoExp = empleoExp;
        this.puestoExp = puestoExp;
        this.periodoExp = periodoExp;
        this.descripExp = descripExp;
    }

    
}
