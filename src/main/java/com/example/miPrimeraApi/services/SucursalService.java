package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Sucursal;
import com.example.miPrimeraApi.repositories.SucursalRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalService extends  BaseService<Sucursal,Long> {
    public SucursalService(SucursalRepository sucursalRepository){
        super(sucursalRepository);
    }
    @Autowired
    private SucursalRepository sucursalRepository;
    @Transactional
    public List<Sucursal> listarPorEmpresa(Long idEmpresa)throws Exception{
        try{
            return sucursalRepository.findAllByEmpresaId(idEmpresa);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public Optional<Sucursal> buscarPorDomicilioId(Long idDomicilio) throws Exception {
        try {
            return Optional.ofNullable(sucursalRepository.findByDomicilioId(idDomicilio));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
