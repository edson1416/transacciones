package com.edsonsarmiento.transacciones.service.interfaces;

import com.edsonsarmiento.transacciones.dto.TipoTransaccionDto;

import java.util.List;

public interface TipoTransaccionInterface {
    List<TipoTransaccionDto> allTipoTransacciones();
    TipoTransaccionDto createTipoTransaccion(TipoTransaccionDto tipoTransaccionDto);
    TipoTransaccionDto updateTipoTransaccion(Long id,TipoTransaccionDto tipoTransaccionDto);
    void deleteTipoTransaccion(Long id);
}
