package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.ArticuloInsumo;
import com.example.miPrimeraApi.entities.Imagen;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo,Long> {
    List<ArticuloInsumo>findAllByCategoriaId(Long idCategoria);
    List<ArticuloInsumo>findAllByUnidadMedidaId(Long idUM);


    default ArticuloInsumo findAllByImagenesArticulosAndId(Long idArticulo) {
        return null;
    }
}
