package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.repositories.PedidoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService extends BaseService<Pedido,Long> {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoService detallePedidoService;
    public PedidoService(PedidoRepository pedidoRepository){
        super(pedidoRepository);
    }
    @Transactional
    public Pedido calcularTotal(Pedido pedido) throws Exception{
        try{
            List<DetallePedido> detallePedidos= detallePedidoService.listarPorPedido(pedido.getId());
            Double total=0.0;
            if (detallePedidos!=null && !detallePedidos.isEmpty()){
                total=detallePedidos.stream()
                        .mapToDouble(detalle ->detalle.getSubtotal()).sum();
            }
            pedido.setTotal(total);
            return pedidoRepository.save(pedido);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public Pedido actualizar(Pedido pedido) throws Exception{
        try{
            calcularTotal((pedido));
            return pedidoRepository.save(pedido);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional

    public List<Pedido> listarPorCliente(Long idCliente)throws Exception{
        try{
            return pedidoRepository.findAllByClienteId(idCliente);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Pedido> listarPorEmpleado(Long idEmpleado)throws Exception{
        try{
            return pedidoRepository.findAllByEmpleadoId(idEmpleado);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Pedido> listarPorDomicilio(Long idDomicilio)throws Exception{
        try{
            return pedidoRepository.findAllByDomicilioId(idDomicilio);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Pedido> listarPorSucursal(Long idSucursal)throws Exception{
        try{
            return pedidoRepository.findAllBySucursalId(idSucursal);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public Optional<Pedido> buscarPorFacturaId(Long idFactura) throws Exception {
        try {
            return Optional.ofNullable(pedidoRepository.findAllByFacturaId(idFactura));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }



}
