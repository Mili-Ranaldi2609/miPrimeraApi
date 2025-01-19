package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Factura;
import com.example.miPrimeraApi.repositories.FacturaRepository;
import com.example.miPrimeraApi.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseController<Factura, Long> {
    public FacturaController(FacturaService facturaService){
        super(facturaService);
    }
    @Autowired
    private FacturaService facturaService;
    @GetMapping("/pedido/{idPedido}")
    public Optional<Factura> buscarPorPedidoId(@PathVariable Long idPedido) throws Exception {
        return facturaService.buscarPorPedidoId(idPedido);
    }
}
