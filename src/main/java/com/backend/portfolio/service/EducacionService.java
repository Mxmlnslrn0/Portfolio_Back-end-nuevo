package com.backend.portfolio.service;

import com.backend.portfolio.models.Educacion;
import com.backend.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    public EducacionRepository EducacionRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        List<Educacion> educacion = EducacionRepo.findAll();
        return educacion;
    }

    @Override
    public void agregarEducacion(Educacion usua) {
        EducacionRepo.save(usua);
    }

    @Override
    public void borrarEducacion(Long id) {
        EducacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion educacion = EducacionRepo.findById(id).orElse(null);
        return educacion;
     }

    @Override
    public void editarEducacion(Educacion usua) {
        EducacionRepo.save(usua);
    }
    
    
}
