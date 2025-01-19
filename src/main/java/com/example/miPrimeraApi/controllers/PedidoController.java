package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.Domicilio;
import com.example.miPrimeraApi.entities.Pedido;
import com.example.miPrimeraApi.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseController<Pedido,Long> {
    @Autowired
    private PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService){
        super(pedidoService);
    }
    @PutMapping("/total")
    public Optional<Pedido> calcularTotal(@RequestBody Pedido pedido)throws Exception{
        Pedido pedido_aux=pedidoService.calcularTotal(pedido);
        return Optional.ofNullable(pedido_aux);
    }
    @GetMapping("/cliente_id/{idCliente}")
    public List<Pedido> getByIdCliente(@PathVariable Long idCliente)throws Exception{
        return pedidoService.listarPorCliente(idCliente);

    }
    @GetMapping("/empleado_id/{idEmpleado}")
    public List<Pedido> getByIdEmpleado(@PathVariable Long idEmpleado)throws Exception{
        return pedidoService.listarPorEmpleado(idEmpleado);

    }
    @GetMapping("/sucursal_id/{idSucursal}")
    public List<Pedido> getByIdSucursal(@PathVariable Long idSucursal)throws Exception{
        return pedidoService.listarPorSucursal(idSucursal);

    }
    @GetMapping("/domicilio_id/{idDomicilio}")
    public List<Pedido> getByIdDomicilio(@PathVariable Long idDomicilio)throws Exception{
        return pedidoService.listarPorDomicilio(idDomicilio);

    }
    @GetMapping("/factura_id/{idFactura}")
    public Optional<Pedido> buscarPorId(@PathVariable Long idFactura) throws Exception {
        return pedidoService.buscarPorFacturaId(idFactura);
    }







}
