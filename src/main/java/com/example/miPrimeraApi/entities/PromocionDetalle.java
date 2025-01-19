package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="promocion_detalles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PromocionDetalle extends Base{
    @Column(name = "cantidad")
    private int cantidad;
    @ManyToOne
    @JoinColumn(name="promocion_id")
    protected Promocion promocion;
    @ManyToOne
    @JoinColumn(name="articulo_id")
    protected Articulo articulo;
}
