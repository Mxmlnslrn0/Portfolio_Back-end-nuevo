package com.backend.portfolio.service;

import com.backend.portfolio.models.Proyectos;
import com.backend.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

   @Autowired
   public ProyectoRepository proyectRepo;
    
    @Override
    public List<Proyectos> verProyecto() {
        List<Proyectos> proyecto = proyectRepo.findAll();
        return proyecto;
    }

    @Override
    public void agregarProyecto(Proyectos pro) {
        proyectRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        Proyectos proyecto = proyectRepo.findById(id).orElse(null);
        return proyecto;
     }

    @Override
    public void editarProyecto(Proyectos pro) {
        proyectRepo.save(pro);
    }
    
    
}
