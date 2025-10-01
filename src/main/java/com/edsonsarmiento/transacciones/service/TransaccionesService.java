package com.edsonsarmiento.transacciones.service;

import com.edsonsarmiento.transacciones.dto.TransaccionesDto;
import com.edsonsarmiento.transacciones.entity.Transacciones;
import com.edsonsarmiento.transacciones.mapper.TransaccionesMapper;
import com.edsonsarmiento.transacciones.repository.TransaccionesRepository;
import com.edsonsarmiento.transacciones.service.interfaces.TransaccionesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionesService implements TransaccionesInterface {

    @Autowired
    private TransaccionesRepository  transaccionesRepository;

    @Autowired
    private TransaccionesMapper  transaccionesMapper;

    @Override
    public List<TransaccionesDto> allTransacciones() {
        List<Transacciones> transacciones = transaccionesRepository.findAll();
        return transaccionesMapper.listEntityToListDto(transacciones);
    }
}
