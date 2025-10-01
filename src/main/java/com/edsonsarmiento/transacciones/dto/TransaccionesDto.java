package com.edsonsarmiento.transacciones.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TransaccionesDto {

    private Long id;

    private String descripcion;

    private double monto;

    private boolean egreso;

    private Date fechaTransaccion;

    private TipoTransaccionDto tipoTransaccion;
}
