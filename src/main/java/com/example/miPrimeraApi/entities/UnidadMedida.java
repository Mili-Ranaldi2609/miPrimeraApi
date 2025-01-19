package com.example.miPrimeraApi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "unidadesMedidas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UnidadMedida extends Base{
    @Column
    private String denominacion;
}
