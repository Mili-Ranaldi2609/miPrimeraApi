package com.example.miPrimeraApi.entities;

import com.example.miPrimeraApi.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente extends Persona{
    @Column(name="rol_cliente")
    private Rol rol;
    /*@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();*/
    @ManyToMany(mappedBy = "clientes")
    private List<Domicilio> domicilios= new ArrayList<>();


}
