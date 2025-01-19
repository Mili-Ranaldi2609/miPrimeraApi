package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.services.ArticuloManufacturadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/articulos_manufacturados")
public class ArticuloManufacturadoController extends BaseController<ArticuloManufacturado,Long> {

    public ArticuloManufacturadoController(ArticuloManufacturadoService articuloManufacturadoService){
        super(articuloManufacturadoService);
    }
    @Autowired
    private ArticuloManufacturadoService articuloManufacturadoService;
    @GetMapping("/categoria_id/{idCategoria}")
    public ResponseEntity<List<ArticuloManufacturado>> listarPorCategoria(@PathVariable Long idCategoria)throws Exception{
        List<ArticuloManufacturado> articulos=articuloManufacturadoService.listarPorCategoria(idCategoria);
        return ResponseEntity.ok(articulos);
    }
    @GetMapping("/unidadMedidaId/{idUM}")
    public ResponseEntity<List<ArticuloManufacturado>> listarPorUnidadMedida(@PathVariable Long idUM)throws Exception{
        List<ArticuloManufacturado> articulos=articuloManufacturadoService.listarPorUnidadMedida(idUM);
        return ResponseEntity.ok(articulos);
    }

    @GetMapping("/imagenesArticuloId/{idArticulo}")
    public ArticuloManufacturado getByIdImagenes(@PathVariable Long idArticulo)throws Exception{
        return articuloManufacturadoService.listarPorImagenesArticulo(idArticulo);
    }


}
