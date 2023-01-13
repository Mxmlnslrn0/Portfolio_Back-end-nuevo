package com.backend.portfolio.controller;

import com.backend.portfolio.models.Habilidades;
import com.backend.portfolio.service.IHabilidadService;
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
@RequestMapping("/habilidad")
public class HabilidadController {
    
    @Autowired IHabilidadService habiServ;
    
    @GetMapping("/verTodo")
    public List<Habilidades> verHabilidad() {
        return habiServ.verHabilidad();
    }
    
    @GetMapping("/traerPorId/{id}")
    public ResponseEntity<Habilidades> buscarHabPorId(@PathVariable("id") Long id) {
        Habilidades hab = habiServ.buscarHabilidad(id);
        return new ResponseEntity(hab, HttpStatus.OK);
    }
    
    @PostMapping("/nuevo")
    public ResponseEntity<Habilidades> agregarHabilidad (@RequestBody Habilidades hab){
        habiServ.agregarHabilidad(hab);
        return new ResponseEntity(hab, HttpStatus.OK);

    }
      
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity borrarHabilidad(@PathVariable Long id){
        habiServ.borrarHabilidad(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarHabilidad(@PathVariable("id") Long id,
                                            @RequestBody Habilidades habilidad){
        Habilidades hab = habiServ.buscarHabilidad(id);
        
        hab.setNombreHab(habilidad.getNombreHab());
        hab.setPorcentajeHab(habilidad.getPorcentajeHab());
        
        
        habiServ.editarHabilidad(habilidad);
        return new ResponseEntity(HttpStatus.OK);
    }
}
