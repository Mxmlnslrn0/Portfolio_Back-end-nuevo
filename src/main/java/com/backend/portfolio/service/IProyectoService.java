package com.backend.portfolio.service;

import com.backend.portfolio.models.Proyectos;
import java.util.List;

public interface IProyectoService {
   
    public List<Proyectos> verProyecto();
    public void agregarProyecto(Proyectos Pro);
    public void borrarProyecto (Long id);
    public Proyectos buscarProyecto (Long id);
    public void editarProyecto (Proyectos Pro);
}
