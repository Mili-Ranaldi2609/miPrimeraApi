package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sucursales")

public class SucursalController extends BaseController<Sucursal,Long>{
    public SucursalController(SucursalService sucursalService){
        super(sucursalService);
    }
    @Autowired
    private SucursalService sucursalService;
    @GetMapping("/empresa_id/{idEmpresa}")
    public List<Sucursal> getByIdEmpresa(@PathVariable Long idEmpresa)throws Exception{
        return sucursalService.listarPorEmpresa(idEmpresa);
    }
    @GetMapping("/domicilioId/{idDomicilio}")
    public Optional<Sucursal> buscarPorDomicilioId(@PathVariable Long idDomicilio) throws Exception {
        return sucursalService.buscarPorDomicilioId(idDomicilio);
    }
}
