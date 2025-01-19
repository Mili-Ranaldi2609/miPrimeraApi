package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.services.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/detalle_pedido")
public class DetallePedidoController extends BaseController<DetallePedido,Long> {
    @Autowired
    private DetallePedidoService detallePedidoService;
    public DetallePedidoController(DetallePedidoService detallePedidoService){
        super(detallePedidoService);
    }
    @GetMapping("/articulo_id/{id}")
    public List<DetallePedido> getByIdArticulo(@PathVariable Long idArticulo)throws Exception{
        return detallePedidoService.listarPorArticulo(idArticulo);
    }
    @GetMapping("/pedido_id/{id}")
    public List<DetallePedido> getByIdPedido(@PathVariable Long idPedido)throws Exception{
        return detallePedidoService.listarPorPedido(idPedido);
    }
}
