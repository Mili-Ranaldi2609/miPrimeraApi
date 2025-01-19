package com.example.miPrimeraApi.repositories;


import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.Promocion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromocionRepository extends BaseRepository<Promocion,Long> {
    List<Imagen> findAllById(Long idPromocion);

    default List<Promocion> findAllBySucursalesAndId(Long idSucursal) {
        return null;
    }
}
