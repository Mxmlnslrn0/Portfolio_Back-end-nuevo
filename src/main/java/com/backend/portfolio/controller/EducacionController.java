package com.backend.portfolio.controller;

import com.backend.portfolio.models.Educacion;
import com.backend.portfolio.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired IEducacionService EducacionServ;
    
    @PostMapping("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion Educ){
        EducacionServ.agregarEducacion(Educ);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion (){
    return EducacionServ.verEducacion();
    }
      
    @DeleteMapping("/{id}")
    public void borrarEducacion(@PathVariable Long id){
        EducacionServ.borrarEducacion(id);
    }
    
    @PutMapping("/editar/educacion")
    public void editarEducacion(@RequestBody Educacion Educ){
        EducacionServ.editarEducacion(Educ);
    }
}
