package com.backend.portfolio.controller;

import com.backend.portfolio.models.Proyectos;
import com.backend.portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    
    @Autowired IProyectoService ProServ;
    
    @PostMapping("/new/proyecto")
    public void agregarProyecto (@RequestBody Proyectos Pro){
        ProServ.agregarProyecto(Pro);
    }
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyectos> verProyecto (){
    return ProServ.verProyecto();
    }
      
    @DeleteMapping("/elim-pro/{id}")
    public void borrarProyecto(@PathVariable Long id){
        ProServ.borrarProyecto(id);
    }
    
    @PutMapping("/editar/proyecto")
    public void editarProyecto(@RequestBody Proyectos Pro){
        ProServ.editarProyecto(Pro);
    }
}
