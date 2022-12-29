package com.backend.portfolio.service;

import com.backend.portfolio.models.Experiencia;
import com.backend.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

   @Autowired
   public ExperienciaRepository ExpeRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return ExpeRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia Expe) {
        ExpeRepo.save(Expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        ExpeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return ExpeRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia Expe) {
        ExpeRepo.save(Expe);
    }
    
}
