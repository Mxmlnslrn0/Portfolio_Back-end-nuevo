package com.backend.portfolio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String nombreEdu;
    private String carreraEdu;
    private int periodoEdu;
    private String descripEdu;
    

    public Educacion() {
    }

    public Educacion(Long idEdu, String nombreEdu, String carreraEdu, int periodoEdu, String descripEdu) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.carreraEdu = carreraEdu;
        this.periodoEdu = periodoEdu;
        this.descripEdu = descripEdu;
    }
    
    
}
