package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado,Long> {
    List<ArticuloManufacturado> findAllByCategoriaId(Long idCategoria);
    List<ArticuloManufacturado>findAllByUnidadMedidaId(Long idUM);


    default ArticuloManufacturado findAllByImagenesArticulosAndId(Long idArticulo) {
        return null;
    }
}
