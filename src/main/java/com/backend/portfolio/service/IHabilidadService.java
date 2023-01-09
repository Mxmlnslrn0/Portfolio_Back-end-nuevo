package com.backend.portfolio.service;

import com.backend.portfolio.models.Habilidades;
import java.util.List;

public interface IHabilidadService {
    public List<Habilidades> verHabilidad();
    public void agregarHabilidad(Habilidades habi);
    public void borrarHabilidad (Long id);
    public Habilidades buscarHabilidad (Long id);
    public void editarHabilidad (Habilidades habi);
}
