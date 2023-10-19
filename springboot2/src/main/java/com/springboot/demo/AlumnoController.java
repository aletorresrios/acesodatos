/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springboot.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Windows
 * parra mariquita
 */
@Controller
public class AlumnoController {
    @Autowired
    private AlumnoRepository alumnorepository;
    
    @PostMapping("/formulario")
    public String guardarAlumno(Alumno alumno){
        alumnorepository.save(alumno);
        return "redirect:/";
    }
    @GetMapping("/")
    public String listaPersonas(Model model) {
        List<Alumno> alumnos = alumnorepository.findAll();
        model.addAttribute("alumnos", alumnos);
        return "home";
    }
    @GetMapping("/formulario")
    public String form(Model model){
        model.addAttribute("alumno", new Alumno());
        return "formulario";
    }
}
