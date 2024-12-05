/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Examen2_Canaquiri.controller;
import com.example.Examen2_Canaquiri.model.Registro;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author FLOMAR
 */
@Controller
public class RegistroController {
   @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("registro", new Registro());
        return "registro";
    }

    // Ruta para procesar el formulario
    @PostMapping("/registro")
    public String procesarFormulario( Registro registro, Model model) {
        model.addAttribute("registro", registro);
        return "exito";
    }
    
}
