package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.UnidadMedida;
import com.example.miPrimeraApi.services.UnidadMedidaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadesMedidas")
public class UnidadMedidaController extends BaseController<UnidadMedida,Long> {
    public UnidadMedidaController(UnidadMedidaService unidadMedidaService){
        super(unidadMedidaService);
    }
}
