package com.example.miPrimeraApi.entities;

import com.example.miPrimeraApi.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Empleado extends Persona{

    @Column(name = "tipoEmpleado")
    private Rol rol;
    @ManyToOne
    @JoinColumn(name="sucursal_id")
    private Sucursal sucursal;
}
