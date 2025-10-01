package com.edsonsarmiento.transacciones.service.interfaces;

import com.edsonsarmiento.transacciones.dto.TransaccionesDto;

import java.util.List;

public interface TransaccionesInterface {

    List<TransaccionesDto> allTransacciones();
}
