package com.example.miPrimeraApi.controllers;
import com.example.miPrimeraApi.entities.Empleado;
import com.example.miPrimeraApi.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController extends BaseController<Empleado,Long>{
    @Autowired
    private EmpleadoService empleadoService;
    public EmpleadoController(EmpleadoService empleadoService){
        super(empleadoService);
    }
    @GetMapping("/sucursal_id/{id}")
    public List<Empleado> getByIdSucursal(@PathVariable Long idSucursal)throws Exception{
        return empleadoService.listarPorSucursal(idSucursal);
    }
    @GetMapping("/usuario_id/{idUsuario}")
    public Optional<Empleado> buscarPorUsuarioId(@PathVariable Long idUsuario) throws Exception {
        return empleadoService.buscarPorUsuarioId(idUsuario);
    }
    @GetMapping("/imagen_id/{idImagen}")
    public Optional<Empleado> buscarPorImagenId(@PathVariable Long idImagen) throws Exception {
        return empleadoService.buscarPorImagenId(idImagen);
    }

}