package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Articulo;
import com.example.miPrimeraApi.entities.Categoria;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends BaseRepository<Categoria,Long> {
    List<Categoria> findAllByCategoriaPadre_Id(Long idCategoriaPadre);

    default List<Categoria> findAllBySucursalesAndId(Long idSucursal) {
        return null;
    }

}
