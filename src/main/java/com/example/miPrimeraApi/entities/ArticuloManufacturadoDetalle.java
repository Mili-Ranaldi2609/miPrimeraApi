package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="articulo_manufacturado_detalle")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ArticuloManufacturadoDetalle extends Base{
    @Column(name = "cantidad")
    private Integer cantidad;
    @ManyToOne
    @JoinColumn(name="articulo_insumo_id")
    private ArticuloInsumo articuloInsumo;
    @ManyToOne
    @JoinColumn(name="articulo_manufacturado_id")
    private ArticuloManufacturado articuloManufacturado;
}
