package com.application.rest.entities;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name =  "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")// aqui es para decirle como queremos que se llame la columna en la tabla
    private String name;

    @Column(name = "precio")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_fabricante", nullable = false)
    private Maker maker;
}
