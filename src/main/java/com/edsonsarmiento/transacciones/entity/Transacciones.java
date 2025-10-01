package com.edsonsarmiento.transacciones.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private double monto;

    private boolean egreso;

    private Date fechaTransaccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_transaccion_id")
    private TipoTransaccion tipoTransaccion;

}
