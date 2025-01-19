package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturadoDetalle;
import com.example.miPrimeraApi.services.ArticuloManufacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulo_manufacturado_detalle")
public class ArticuloManufacturadoDetalleController extends BaseController<ArticuloManufacturadoDetalle,Long> {
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService){
        super(articuloManufacturadoDetalleService);
    }
    @Autowired
    private ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;
    @GetMapping("/articulo_insumo_id/{idArticuloInsumo}")
    public List<ArticuloManufacturadoDetalle> getByIdArticuloInsumo(@PathVariable Long idArticuloInsumo)throws Exception{
        return articuloManufacturadoDetalleService.listarPorArticuloInsumo(idArticuloInsumo);
    }
    @GetMapping("/articulo_manufacturado_id/{idArticuloManufacturado}")
    public List<ArticuloManufacturadoDetalle> getByIdArticuloManufacturado(@PathVariable Long idArticuloManufacturado)throws Exception{
        return articuloManufacturadoDetalleService.listarPorArticuloManufacutrado(idArticuloManufacturado);
    }
}
