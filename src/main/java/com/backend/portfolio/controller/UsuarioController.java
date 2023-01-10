package com.backend.portfolio.controller;

import com.backend.portfolio.models.Usuarios;
import com.backend.portfolio.service.IUSuarioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired IUSuarioService usuarioServ;
    
    @GetMapping("/verTodo")
    public List<Usuarios> verUsuarios() {
        return usuarioServ.verUsuarios();
    }
    
    @GetMapping("/traer")
        public Usuarios encontrarUsuario(){
            return usuarioServ.buscarUsuario((long)502);
        }
    
    @GetMapping("/traerPorId/{id}")
    public ResponseEntity<Usuarios> buscarUsuPorId(@PathVariable("id") Long id) {
        Usuarios usuar = usuarioServ.buscarUsuario(id);
        return new ResponseEntity(usuar, HttpStatus.OK);
    }
    
    @PostMapping("/nuevo")
    public String agregarUsuario (@RequestBody Usuarios usua){
        usuarioServ.agregarUsuario(usua);
        return "El usuario se creo satisfactoriamente";
    }
      
    /*@DeleteMapping("/eliminar/{id}")
    public String borrarUsuarios(@PathVariable Long id){
        usuarioServ.borrarUsuario(id);
        return "El usuario se borró correctamente";
    }*/
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarUsuarios(@PathVariable("id") Long id,
                                            @RequestBody Usuarios usua){
        Usuarios usu = usuarioServ.buscarUsuario(id);
        
        usu.setNombreUsu(usua.getNombreUsu());
        usu.setOficioUsu(usua.getOficioUsu());                                      
        usu.setDescripUsu(usua.getDescripUsu());
        usu.setImgUsu(usua.getImgUsu());
        
        
        usuarioServ.agregarUsuario(usua);
        return new ResponseEntity(HttpStatus.OK);
    }
}
