package com.backend.portfolio.controller;

import com.backend.portfolio.models.Experiencia;
import com.backend.portfolio.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired IExperienciaService ExpServ;
    
    @PostMapping("/experiencia/nuevo")
    public void agregarExperiencia (@RequestBody Experiencia Exp){
        ExpServ.agregarExperiencia(Exp);
    }
    
    @GetMapping("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia (){
    return ExpServ.verExperiencia();
    }
      
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        ExpServ.borrarExperiencia(id);
    }
    
    @PutMapping("/experiencia/editar")
    public void editarExperiencia(@RequestBody Experiencia Exp){
        ExpServ.editarExperiencia(Exp);
    }
}
