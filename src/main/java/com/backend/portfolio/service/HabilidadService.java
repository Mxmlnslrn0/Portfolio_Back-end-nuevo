package com.backend.portfolio.service;

import com.backend.portfolio.models.Habilidades;
import com.backend.portfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService{

    @Autowired
    public HabilidadRepository habiRepo;
    
    @Override
    public List<Habilidades> verHabilidad() {
        List<Habilidades> habilidad = habiRepo.findAll();
        return habilidad;
    }

    @Override
    public void agregarHabilidad(Habilidades habi) {
        habiRepo.save(habi);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(Long id) {
        Habilidades habilidad = habiRepo.findById(id).orElse(null);
        return habilidad;
     }

    @Override
    public void editarHabilidad(Habilidades habi) {
        habiRepo.save(habi);
    }
    
}
