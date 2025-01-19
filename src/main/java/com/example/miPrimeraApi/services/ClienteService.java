package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService extends BaseService<Cliente, Long> {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private DomicilioService domicilioService;

    public ClienteService(ClienteRepository clienteRepository){
        super(clienteRepository);
    }
    @Transactional
    public Optional<Cliente> buscarPorUsuarioId(Long idUsuario) throws Exception {
        try {
            return Optional.ofNullable(clienteRepository.findAllByUsuarioId(idUsuario));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public Optional<Cliente> buscarPorImagenId(Long idImagen) throws Exception {
        try {
            return Optional.ofNullable(clienteRepository.findAllByImagenPersonaId(idImagen));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }



}
