package com.backend.portfolio.controller;

import com.backend.portfolio.models.Usuarios;
import com.backend.portfolio.service.IUSuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
    
    @Autowired IUSuarioService usuarioServ;
    
    @PostMapping("/usuario/nuevo")
    public void agregarUsuario (@RequestBody Usuarios usua){
        usuarioServ.agregarUsuario(usua);
    }
    
    @GetMapping("/usuario/ver")
    @ResponseBody
    public List<Usuarios> verUsuarios (){
    return usuarioServ.verUsuarios();
    }
      
    @DeleteMapping("/usuario/{id}")
    public void borrarUsuarios(@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
    }
    
    @PutMapping("/usuario/editar")
    public void editarUsuarios(@RequestBody Usuarios usua){
        usuarioServ.editarUsuario(usua);
    }
    
    @GetMapping("/usuario/traer")
        public Usuarios encontrarUsuario(){
            return usuarioServ.buscarUsuario((long)1);
        }
}
