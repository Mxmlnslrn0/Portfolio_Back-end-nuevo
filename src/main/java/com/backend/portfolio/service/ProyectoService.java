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
        return proyectRepo.findAll();
   }

    @Override
    public void agregarProyecto(Proyectos Pro) {
        proyectRepo.save(Pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyectRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyecto(Proyectos Pro) {
        proyectRepo.save(Pro);
    }   
}
