package com.backend.portfolio.service;

import com.backend.portfolio.models.Experiencia;
import com.backend.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository ExperienciaRepo;
    
   @Override
    public List<Experiencia> verExperiencia() {
        List<Experiencia> experiencia = ExperienciaRepo.findAll();
        return experiencia;
    }

    @Override
    public void agregarExperiencia(Experiencia expe) {
        ExperienciaRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        ExperienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        Experiencia experiencia = ExperienciaRepo.findById(id).orElse(null);
        return experiencia;
     }

    @Override
    public void editarExperiencia(Experiencia expe) {
        ExperienciaRepo.save(expe);
    }
    
    
}
