package com.example.miPrimeraApi.controllers;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.services.ArticuloInsumoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articulos_insumo")
public class ArticuloInsumoController extends BaseController<ArticuloInsumo,Long> {
    public ArticuloInsumoController(ArticuloInsumoService articuloInsumoService){
        super(articuloInsumoService);
    }
    @Autowired
    private ArticuloInsumoService articuloInsumoService;
    @GetMapping("/categoria_id/{idCategoria}")
    public ResponseEntity<List<ArticuloInsumo>> listarPorCategoria(@PathVariable Long idCategoria)throws Exception{
        List<ArticuloInsumo> articulos=articuloInsumoService.listarPorCategoria(idCategoria);
        return ResponseEntity.ok(articulos);
    }
    @GetMapping("/unidadMedidaId/{idUM}")
    public ResponseEntity<List<ArticuloInsumo>> listarPorUnidadMedida(@PathVariable Long idUM)throws Exception{
        List<ArticuloInsumo> articulos=articuloInsumoService.listarPorUnidadMedida(idUM);
        return ResponseEntity.ok(articulos);
    }

    @GetMapping("/imagenesArticuloId/{idArticulo}")
    public ArticuloInsumo getByIdImagenes(@PathVariable Long idArticulo)throws Exception{
        return articuloInsumoService.listarPorImagenesArticulo(idArticulo);
    }

}
