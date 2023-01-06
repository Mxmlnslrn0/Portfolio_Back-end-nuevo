package com.backend.portfolio.service;

import com.backend.portfolio.models.Usuarios;
import java.util.List;

public interface IUSuarioService {
 
    public List<Usuarios> verUsuarios();
    public void agregarUsuario(Usuarios usua);
    public void borrarUsuario (Long id);
    public Usuarios buscarUsuario (Long id);
}
