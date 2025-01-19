package com.example.miPrimeraApi.entities;

import com.example.miPrimeraApi.entities.enums.FormaPago;
import jakarta.persistence.*;
import lombok.*;
;import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="facturas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends Base{
    @Column(name="fecha_fact")
    private LocalDate fechaFacturacion;
    @Column
    private Integer mpPaymentId;
    @Column
    private Integer mpMerchantOrderId;
    @Column
    private String mpPreferenceId;
    @Column
    private String mpPaymentType;
    @Column(name="forma_pago")
    private FormaPago formaPago;
    @Column
    private double total_venta;
    @OneToOne(mappedBy = "factura")
    private Pedido pedido;
}
