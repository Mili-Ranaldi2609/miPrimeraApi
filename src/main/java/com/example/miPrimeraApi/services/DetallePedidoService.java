package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.repositories.DetallePedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService extends BaseService<DetallePedido,Long> {
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository){
        super(detallePedidoRepository);
    }
    @Transactional
    public List<DetallePedido> listarPorPedido(Long idPedido)throws Exception{
        try{
            return detallePedidoRepository.findAllByPedidoId(idPedido);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<DetallePedido> listarPorArticulo(Long idArticulo) throws Exception{
        try{
            return detallePedidoRepository.findAllByArticuloId(idArticulo);

        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
