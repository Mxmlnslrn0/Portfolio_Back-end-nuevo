package com.backend.portfolio.controller;

import com.backend.portfolio.models.Educacion;
import com.backend.portfolio.service.IEducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    
    @Autowired IEducacionService educacionServ;
    
    @GetMapping("/verTodo")
    public List<Educacion> verEducacion() {
        return educacionServ.verEducacion();
    }
    
    @GetMapping("/traerPorId/{id}")
    public ResponseEntity<Educacion> buscarEduPorId(@PathVariable("id") Long id) {
        Educacion educ = educacionServ.buscarEducacion(id);
        return new ResponseEntity(educ, HttpStatus.OK);
    }
    
    @PostMapping("/nuevo")
    public ResponseEntity<Educacion> agregarEducacion (@RequestBody Educacion educ){
        educacionServ.agregarEducacion(educ);
        return new ResponseEntity(educ, HttpStatus.OK);
    }
      
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity borrarEducacion(@PathVariable Long id){
        educacionServ.borrarEducacion(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarEducacion(@PathVariable("id") Long id,
                                            @RequestBody Educacion educacion){
        Educacion edu = educacionServ.buscarEducacion(id);
        
        edu.setNombreEdu(educacion.getNombreEdu());
        edu.setCarreraEdu(educacion.getCarreraEdu());
        edu.setPeriodo_unoEdu(educacion.getPeriodo_unoEdu());
        edu.setPeriodo_dosEdu(educacion.getPeriodo_dosEdu());
        edu.setDescripEdu(educacion.getDescripEdu());
        edu.setImgEdu(educacion.getImgEdu());
        
        
        educacionServ.editarEducacion(educacion);
        return new ResponseEntity(HttpStatus.OK);
    }
}
