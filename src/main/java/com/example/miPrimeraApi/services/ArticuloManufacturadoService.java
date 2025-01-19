package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.ArticuloManufacturado;
import com.example.miPrimeraApi.repositories.ArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ArticuloManufacturadoService extends BaseService<ArticuloManufacturado,Long> {
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    public ArticuloManufacturadoService(ArticuloManufacturadoRepository articuloManufacturadoRepository){
        super(articuloManufacturadoRepository);
    }
    @Transactional
    public List<ArticuloManufacturado> listarPorCategoria(Long idCategoria) throws Exception {
        try{
            return articuloManufacturadoRepository.findAllByCategoriaId(idCategoria);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<ArticuloManufacturado> listarPorUnidadMedida(Long idUM) throws Exception {
        try{
            return articuloManufacturadoRepository.findAllByUnidadMedidaId(idUM);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public ArticuloManufacturado listarPorImagenesArticulo(Long idArticulo)throws Exception{
        try{
            return articuloManufacturadoRepository.findAllByImagenesArticulosAndId(idArticulo);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
