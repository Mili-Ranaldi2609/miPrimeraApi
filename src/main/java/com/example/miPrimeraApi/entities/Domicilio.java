package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="domicilios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Domicilio extends Base{
    @Column(name="calle")
    private String calle;
    @Column(name="numero")
    private int numero;
    @Column(name="cp")
    private int cp;
    @ManyToOne
    @JoinColumn(name="localidad_id")
    private Localidad localidad;
    @ManyToMany
    @JoinTable(name = "domicilio_clienteId",joinColumns = @JoinColumn(name = "domicilioId"),inverseJoinColumns = @JoinColumn(name="clienteId"))
    private Set<Cliente> clientes=new HashSet<>();
}
