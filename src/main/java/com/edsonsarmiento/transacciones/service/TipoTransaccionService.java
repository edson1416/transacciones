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
        return tipoTransaccionMapper.listEntityToListDto(tipoTransaccionRepository.findAll());
    }

    @Override
    public TipoTransaccionDto createTipoTransaccion(TipoTransaccionDto tipoTransaccionDto) {
        return tipoTransaccionMapper.entityToDto(
                tipoTransaccionRepository.save(tipoTransaccionMapper.dtoToEntity(tipoTransaccionDto))
        );
    }

    @Override
    public TipoTransaccionDto updateTipoTransaccion(Long id, TipoTransaccionDto tipoTransaccionDto) {
        return tipoTransaccionRepository.findById(id).map(
                entidad ->{
                    entidad.setNombre(tipoTransaccionDto.getNombre());
                    entidad.setDescripcion(tipoTransaccionDto.getDescripcion());

                    return tipoTransaccionMapper.entityToDto(tipoTransaccionRepository.save(entidad));
                }).orElseThrow(() -> new RuntimeException("No existe el tipo de transaccion"));
    }

    @Override
    public void deleteTipoTransaccion(Long id) {
        if (!tipoTransaccionRepository.existsById(id)){
            throw new RuntimeException("Tipo Transaccion no encontrado");
        }
        tipoTransaccionRepository.deleteById(id);
    }
}
