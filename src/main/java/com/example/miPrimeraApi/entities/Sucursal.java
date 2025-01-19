package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "sucursales")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sucursal extends Base{
    @Column(name="nombre")
    private String nombre;
    @Column(name="horario_apertura")
    private LocalTime horarioApertura;
    @Column(name="horario_cierre")
    private LocalTime horarioCierre;
    @Column(name="casa_matriz")
    private Boolean casaMatriz;
    @ManyToOne
    @JoinColumn(name="empresa_id")
    private Empresa empresa;
    @OneToOne
    @JoinColumn(name="domicilioId")
    private Domicilio domicilio;
    @ManyToMany(mappedBy = "sucursales")
    private Set<Categoria>categorias=new HashSet<>();
    @ManyToMany(mappedBy = "sucursales")
    private Set<Promocion>promociones=new HashSet<>();


}
