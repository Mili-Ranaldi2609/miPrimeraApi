package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.PromocionDetalle;
import com.example.miPrimeraApi.services.PromocionDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promocion_detalles")
public class PromocionDetalleController extends BaseController<PromocionDetalle,Long> {
    @Autowired
    private PromocionDetalleService promocionDetalleService;
    public PromocionDetalleController(PromocionDetalleService promocionDetalleService){
        super(promocionDetalleService);
    }
    @GetMapping("/articulo_id/{idArticulo}")
    public List<PromocionDetalle> getByIdArticulo(@PathVariable Long idArticulo)throws Exception{
        return promocionDetalleService.listarPorArticulo(idArticulo);
    }
    @GetMapping("/promocion_id/{idPromocion}")
    public List<PromocionDetalle> getByIdPromocion(@PathVariable Long idPromocion)throws Exception{
        return promocionDetalleService.listarPorPromocion(idPromocion);
    }
}
