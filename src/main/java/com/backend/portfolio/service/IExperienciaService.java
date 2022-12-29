package com.backend.portfolio.service;

import com.backend.portfolio.models.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    public void agregarExperiencia(Experiencia Expe);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    public void editarExperiencia (Experiencia Expe);
}
