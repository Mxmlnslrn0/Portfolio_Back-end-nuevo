package com.backend.portfolio.controller;

import com.backend.portfolio.models.Proyectos;
import com.backend.portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://login-9002b.web.app")
@RequestMapping("/proyecto")
public class ProyectosController {
    
    @Autowired IProyectoService proServ;
    
    @GetMapping("/verTodo")
    public List<Proyectos> verProyecto() {
        return proServ.verProyecto();
    }
    
    @GetMapping("/traerPorId/{id}")
    public ResponseEntity<Proyectos> buscarEduPorId(@PathVariable("id") Long id) {
        Proyectos proy = proServ.buscarProyecto(id);
        return new ResponseEntity(proy, HttpStatus.OK);
    }
    
    @PostMapping("/nuevo")
    public ResponseEntity<Proyectos> agregarProyecto (@RequestBody Proyectos proyect){
        proServ.agregarProyecto(proyect);
        return new ResponseEntity(proyect, HttpStatus.OK);
    }
      
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Proyectos> borrarProyecto(@PathVariable Long id){
        proServ.borrarProyecto(id);
        return new ResponseEntity(id, HttpStatus.OK);

    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarProyecto(@PathVariable("id") Long id,
                                            @RequestBody Proyectos proyecto){
        Proyectos pro = proServ.buscarProyecto(id);
        
        pro.setNombrePro(proyecto.getNombrePro());
        pro.setDescripPro(proyecto.getDescripPro());
        
        proServ.editarProyecto(proyecto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
