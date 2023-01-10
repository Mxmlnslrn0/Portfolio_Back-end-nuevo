package com.backend.portfolio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUsu;
    private String nombreUsu;
    private String oficioUsu;
    private String descripUsu;
    private String imgUsu;

    public Usuarios() {
    }

    public Usuarios(String nombreUsu, String oficioUsu, String descripUsu, String imgUsu) {
        this.nombreUsu = nombreUsu;
        this.oficioUsu = oficioUsu;
        this.descripUsu = descripUsu;
        this.imgUsu = imgUsu;
    }

    
}
