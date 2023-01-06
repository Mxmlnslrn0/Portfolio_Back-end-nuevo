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

    public Usuarios() {
    }

    public Usuarios(Long idUsu, String nombreUsu, String oficioUsu, String descripUsu) {
        this.idUsu = idUsu;
        this.nombreUsu = nombreUsu;
        this.oficioUsu = oficioUsu;
        this.descripUsu = descripUsu;
    }
}
