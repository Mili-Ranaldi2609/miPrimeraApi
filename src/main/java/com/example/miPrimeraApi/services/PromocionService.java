package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Imagen;
import com.example.miPrimeraApi.entities.Promocion;
import com.example.miPrimeraApi.repositories.PromocionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromocionService extends BaseService<Promocion,Long> {
    @Autowired
    private PromocionRepository promocionRepository;
    public PromocionService(PromocionRepository promocionRepository){
        super(promocionRepository);
    }
    @Transactional
    public List<Imagen> listarImagenPorIdPromocion(Long idPromocion) throws Exception {
        try {
            return promocionRepository.findAllById(idPromocion);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Promocion> listarPorSucursalesID(Long idSucursal)throws Exception{
        try{
            return promocionRepository.findAllBySucursalesAndId(idSucursal);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

}

