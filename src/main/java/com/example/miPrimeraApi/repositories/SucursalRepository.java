package com.example.miPrimeraApi.repositories;

import com.example.miPrimeraApi.entities.Categoria;
import com.example.miPrimeraApi.entities.Sucursal;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SucursalRepository extends BaseRepository<Sucursal,Long>{
    List<Sucursal> findAllByEmpresaId(Long idEmpresa);
    Sucursal findByDomicilioId(Long idSucursal);

}
