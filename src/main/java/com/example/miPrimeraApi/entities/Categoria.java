package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="categorias")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Categoria extends Base{
    @Column(name="denominacion")
    private String denominacion;
    @OneToMany(mappedBy = "categoriaPadre")
    @Builder.Default
    private Set<Categoria> subcategorias=new HashSet<>();
    @ManyToOne
    @JoinColumn(name="categoriaPadreID")
    private Categoria categoriaPadre;
    @ManyToMany
    @JoinTable(name = "categoriaSucursalId",joinColumns = @JoinColumn(name = "categoriaId"),inverseJoinColumns = @JoinColumn(name="sucursalId"))
    private Set<Sucursal> sucursales=new HashSet<>();



}
