package com.backend.portfolio.service;

import com.backend.portfolio.models.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    public void agregarEducacion(Educacion usua);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    public void editarEducacion (Educacion usua);
}
