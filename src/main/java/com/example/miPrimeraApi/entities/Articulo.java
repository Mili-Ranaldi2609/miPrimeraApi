package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "articulos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Articulo extends Base{
    @Column(name = "denominacion")
    protected String denominacion;
    @Column(name = "precio_venta")
    protected Double precioVenta;
    @OneToMany
    @Builder.Default
    protected Set<Imagen>imagenesArticulos=new HashSet<>();
    @ManyToOne
    @JoinColumn(name="categoriaId")
    protected Categoria categoria;
    @ManyToOne
    @JoinColumn(name="unidadMedidaId")
    protected UnidadMedida unidadMedida;
    @OneToMany
    @JoinColumn(name = "imagenesArticuloId")
    protected Set<Imagen> imagenes=new HashSet<>();

}
