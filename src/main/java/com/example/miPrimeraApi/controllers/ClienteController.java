package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseController<Cliente, Long>{
    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        super(clienteService);
    }
    @GetMapping("/usuario_id/{idUsuario}")
    public Optional<Cliente> buscarPorUsuarioId(@PathVariable Long idUsuario) throws Exception {
        return clienteService.buscarPorUsuarioId(idUsuario);
    }
    @GetMapping("/imagen_id/{idImagen}")
    public Optional<Cliente> buscarPorImagenId(@PathVariable Long idImagen) throws Exception {
        return clienteService.buscarPorImagenId(idImagen);
    }


    }


