package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.entities.PromocionDetalle;
import com.example.miPrimeraApi.services.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseController<Domicilio,Long>{
    @Autowired
    private DomicilioService domicilioService;
    public DomicilioController(DomicilioService domicilioService){
        super(domicilioService);
    }
    @GetMapping("/localidad_id/{id}")
    public List<Domicilio> getByIdPedido(@PathVariable Long idLocalidad)throws Exception{
            return domicilioService.listarPorLocalidad(idLocalidad);

    }
    @GetMapping("/domicilio_clienteId/{clienteId}")
    public List<Domicilio> getByIdClientes(@PathVariable Long clienteId)throws Exception{
        return domicilioService.listarPorClientesID(clienteId);
    }
}
