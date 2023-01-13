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
    private String periodo_unoEdu;
    private String periodo_dosEdu;
    private String descripEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String nombreEdu, String carreraEdu, String periodo_unoEdu, String periodo_dosEdu, String descripEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.carreraEdu = carreraEdu;
        this.periodo_unoEdu = periodo_unoEdu;
        this.periodo_dosEdu = periodo_dosEdu;
        this.descripEdu = descripEdu;
        this.imgEdu = imgEdu;
    }

    

    

    
    
}
