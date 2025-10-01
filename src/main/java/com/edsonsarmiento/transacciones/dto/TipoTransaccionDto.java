package com.edsonsarmiento.transacciones.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TipoTransaccionDto {

    private Long id;

    @NotNull(message = "El campo nombre no puede ser nulo")
    @Size(max = 200, min = 6)
    private String nombre;

    private String descripcion;
}
