package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Cliente;
import com.example.miPrimeraApi.entities.Domicilio;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long> {
    List<Domicilio>findAllByLocalidadId(Long idLocalidad);

    default List<Domicilio> findAllByClientesAndId(Long idCliente) {
        return null;
    }

}
