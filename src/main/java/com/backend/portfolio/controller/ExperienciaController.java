package com.backend.portfolio.controller;

import com.backend.portfolio.models.Experiencia;
import com.backend.portfolio.service.IExperienciaService;
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
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/experiencia")
public class ExperienciaController {
    
    @Autowired IExperienciaService expServ;
    
    @GetMapping("/verTodo")
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
    @GetMapping("/traerPorId/{id}")
    public ResponseEntity<Experiencia> buscarEduPorId(@PathVariable("id") Long id) {
        Experiencia exper = expServ.buscarExperiencia(id);
        return new ResponseEntity(exper, HttpStatus.OK);
    }
    
    @PostMapping("/nuevo")
    public ResponseEntity<Experiencia> agregarExperiencia (@RequestBody Experiencia experi){
        expServ.agregarExperiencia(experi);
        return new ResponseEntity(experi, HttpStatus.OK);
    }
      
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Experiencia> borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarExperiencia(@PathVariable("id") Long id,
                                            @RequestBody Experiencia experiencia){
        Experiencia exp = expServ.buscarExperiencia(id);
        
        exp.setEmpleoExp(experiencia.getEmpleoExp());
        exp.setPuestoExp(experiencia.getPuestoExp());
        exp.setPeriodo_unoExp(experiencia.getPeriodo_unoExp());
        exp.setPeriodo_dosExp(experiencia.getPeriodo_dosExp());
        exp.setDescripExp(experiencia.getDescripExp());
        exp.setImgExp(experiencia.getImgExp());
        
        expServ.editarExperiencia(experiencia);
        return new ResponseEntity(HttpStatus.OK);
    }
}
