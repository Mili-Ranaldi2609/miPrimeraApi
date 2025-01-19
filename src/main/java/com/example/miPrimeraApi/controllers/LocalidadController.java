package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.entities.Localidad;
import com.example.miPrimeraApi.repositories.LocalidadRepository;
import com.example.miPrimeraApi.services.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseController<Localidad,Long>{
    @Autowired
    private LocalidadService localidadService;
    public LocalidadController(LocalidadService localidadService){
        super(localidadService);
    }
    @GetMapping("/provincia_id/{id}")
    public List<Localidad> getByIdProvincia(@PathVariable Long idProvincia)throws Exception{
        return localidadService.listarPorProvincia(idProvincia);

    }
}
