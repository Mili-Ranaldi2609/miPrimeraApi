package com.example.miPrimeraApi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "detalle_pedido")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetallePedido extends Base{
    @Column(name="cantidad")
    private Integer cantidad;
    @Column(name="subtotal")
    private Double subtotal;
    @ManyToOne
    @JoinColumn(name="pedido_id")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name="articulo_id")
    private Articulo articulo;

}
