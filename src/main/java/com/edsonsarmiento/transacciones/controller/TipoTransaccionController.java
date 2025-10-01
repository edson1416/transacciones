package com.edsonsarmiento.transacciones.controller;

import com.edsonsarmiento.transacciones.dto.TipoTransaccionDto;
import com.edsonsarmiento.transacciones.service.TipoTransaccionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipo-transaccion")
public class TipoTransaccionController {

    @Autowired
    private TipoTransaccionService tipoTransaccionService;

    @Tag(name = "Tipo de transacciones")
    @Operation(description = "Lista de tipos de transacciones")
    @GetMapping()
    public ResponseEntity<List<TipoTransaccionDto>> allTipoTransacciones(){
        return new ResponseEntity<>(tipoTransaccionService.allTipoTransacciones(), HttpStatus.OK);
    }
}
