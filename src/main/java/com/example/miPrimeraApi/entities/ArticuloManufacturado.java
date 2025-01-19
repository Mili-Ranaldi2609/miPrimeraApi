package com.example.miPrimeraApi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="articulos_manufacturados")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ArticuloManufacturado extends Articulo{
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempo_estimado_min")
    private Integer tiempoEstimadoMinutos;
    @Column(name = "preparacion")
    private String preparacion;
}
