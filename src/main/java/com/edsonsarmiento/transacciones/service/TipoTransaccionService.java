package com.edsonsarmiento.transacciones.service;

import com.edsonsarmiento.transacciones.dto.TipoTransaccionDto;
import com.edsonsarmiento.transacciones.entity.TipoTransaccion;
import com.edsonsarmiento.transacciones.mapper.TipoTransaccionMapper;
import com.edsonsarmiento.transacciones.repository.TipoTransaccionRepository;
import com.edsonsarmiento.transacciones.service.interfaces.TipoTransaccionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoTransaccionService implements TipoTransaccionInterface {


    @Autowired
    private TipoTransaccionRepository tipoTransaccionRepository;

    @Autowired
    private TipoTransaccionMapper tipoTransaccionMapper;

    @Override
    public List<TipoTransaccionDto> allTipoTransacciones() {
        List<TipoTransaccion> listaTipoTransacciones = tipoTransaccionRepository.findAll();
        return tipoTransaccionMapper.listEntityToListDto(listaTipoTransacciones);
    }
}
