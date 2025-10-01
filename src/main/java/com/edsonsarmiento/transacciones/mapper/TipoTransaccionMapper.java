package com.edsonsarmiento.transacciones.mapper;

import com.edsonsarmiento.transacciones.dto.TipoTransaccionDto;
import com.edsonsarmiento.transacciones.entity.TipoTransaccion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoTransaccionMapper {

    TipoTransaccionMapper INSTANCE = Mappers.getMapper(TipoTransaccionMapper.class);

    @Mappings({})
    TipoTransaccionDto entityToDto(TipoTransaccion transaccion);

    @InheritInverseConfiguration
    TipoTransaccion dtoToEntity(TipoTransaccionDto transaccionDto);

    @Mappings({})
    List<TipoTransaccionDto> listEntityToListDto(List<TipoTransaccion> transacciones);
}
