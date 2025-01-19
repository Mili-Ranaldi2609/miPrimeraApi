package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Empresa;
import com.example.miPrimeraApi.services.EmpresaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController extends BaseController<Empresa,Long>{
    public EmpresaController(EmpresaService empresaService){
        super(empresaService);
    }
}
