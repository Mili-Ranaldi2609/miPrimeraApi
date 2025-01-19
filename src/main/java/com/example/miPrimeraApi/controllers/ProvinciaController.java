package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.entities.Provincia;
import com.example.miPrimeraApi.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseController<Provincia,Long> {
    public ProvinciaController(ProvinciaService provinciaService){
        super(provinciaService);
    }
    @Autowired
    private ProvinciaService provinciaService;
    @GetMapping("/pais_id/{id}")
    public List<Provincia> getByIdPais(@PathVariable Long idPais)throws Exception{
        return provinciaService.listarPorPais(idPais);

    }
}
