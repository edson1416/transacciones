package com.edsonsarmiento.transacciones.controller;

import com.edsonsarmiento.transacciones.dto.TransaccionesDto;
import com.edsonsarmiento.transacciones.service.TransaccionesService;
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
@RequestMapping("/transacciones")
public class TransaccionesController {

    @Autowired
    private TransaccionesService  transaccionesService;

    @Tag(name = "Transacciones")
    @Operation(description = "Listado de todas las transacciones")
    @GetMapping()
    public ResponseEntity<List<TransaccionesDto>> listaTransacciones() {
        return new ResponseEntity<>(transaccionesService.allTransacciones(), HttpStatus.OK);
    }
}
