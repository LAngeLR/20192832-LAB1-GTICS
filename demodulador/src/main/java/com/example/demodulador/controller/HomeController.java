package com.example.demodulador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/Vuelos")
    public String vuelos(){
        return "home/Vuelos";
    }
    @GetMapping("/Paquetes")
    public String paquetes(){
        return "home/Paquetes";
    }
    @GetMapping("/Hoteles")
    public String hoteles(){
        return "home/Hoteles";
    }
    @GetMapping("/Autos")
    public String autos(){
        return "home/Autos";
    }
    @GetMapping("/Seguros")
    public String seguros(){
        return "home/Seguros";
    }
    @GetMapping("/Upgrade")
    public String upgrade(){
        return "home/Upgrade";
    }
    @GetMapping("/CentroAyuda")
    public String centroAyuda(){
        return "home/CentroAyuda";
    }

}
