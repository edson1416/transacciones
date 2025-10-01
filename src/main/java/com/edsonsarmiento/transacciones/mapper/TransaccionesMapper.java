package com.edsonsarmiento.transacciones.mapper;

import com.edsonsarmiento.transacciones.dto.TransaccionesDto;
import com.edsonsarmiento.transacciones.entity.Transacciones;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TipoTransaccionMapper.class})
public interface TransaccionesMapper {

    TransaccionesMapper INSTANCE = Mappers.getMapper(TransaccionesMapper.class);

    @Mappings({})
    Transacciones dtoToEntity(TransaccionesDto transaccionesDto);

    @InheritInverseConfiguration
    TransaccionesDto entityToDto(Transacciones transacciones);

    @Mappings({})
    List<TransaccionesDto> listEntityToListDto(List<Transacciones> transacciones);
}
