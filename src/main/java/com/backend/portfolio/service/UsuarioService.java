package com.backend.portfolio.service;

import com.backend.portfolio.models.Usuarios;
import com.backend.portfolio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUSuarioService {

    @Autowired
    public UsuarioRepository UsuarioRepo; 
    
    @Override
    public List<Usuarios> verUsuarios() {
       return UsuarioRepo.findAll();
    }

    @Override
    public void agregarUsuario(Usuarios usua) {
        UsuarioRepo.save(usua);
    }

    @Override
    public void borrarUsuario(Long id) {
        UsuarioRepo.deleteById(id);
    }

    @Override
    public Usuarios buscarUsuario(Long id) {
        return UsuarioRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarUsuario(Usuarios usua) {
        UsuarioRepo.save(usua);
    }
    
}
