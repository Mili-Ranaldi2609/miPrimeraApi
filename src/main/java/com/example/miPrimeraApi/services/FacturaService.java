package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Factura;
import com.example.miPrimeraApi.repositories.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacturaService extends BaseService<Factura,Long> {
    public FacturaService(FacturaRepository facturaRepository){
        super(facturaRepository);
    }
    @Autowired
    private FacturaRepository facturaRepository;
    public Optional<Factura> buscarPorPedidoId(Long idPedido) throws Exception {
        try {
            return Optional.of(facturaRepository.findAllByPedidoId(idPedido));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
