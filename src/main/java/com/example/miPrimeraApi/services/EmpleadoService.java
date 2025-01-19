package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.DetallePedido;
import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.repositories.BaseRepository;
import com.example.miPrimeraApi.repositories.EmpleadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService extends BaseService<Empleado,Long> {
    @Autowired
    private EmpleadoRepository empleadoRepository;
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        super(empleadoRepository);
    }
    @Transactional
    public List<Empleado> listarPorSucursal(Long idSucursal)throws Exception{
        try{
            return empleadoRepository.findAllBySucursalId(idSucursal);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional

    public Optional<Empleado> buscarPorUsuarioId(Long idUsuario) throws Exception {
        try {
            return Optional.ofNullable(empleadoRepository.findAllByUsuarioId(idUsuario));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional

    public Optional<Empleado> buscarPorImagenId(Long idImagen) throws Exception {
        try {
            return Optional.ofNullable(empleadoRepository.findAllByImagenPersonaId(idImagen));
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }




}
