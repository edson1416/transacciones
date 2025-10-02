package com.edsonsarmiento.transacciones.controller;

import com.edsonsarmiento.transacciones.dto.TipoTransaccionDto;
import com.edsonsarmiento.transacciones.service.TipoTransaccionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(tipoTransaccionService.allTipoTransacciones());
    }

    @Tag(name = "Tipo de transacciones")
    @PostMapping()
    public ResponseEntity<TipoTransaccionDto> createTipoTransaccion(@Valid @RequestBody TipoTransaccionDto tipoTransaccionDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoTransaccionService.createTipoTransaccion(tipoTransaccionDto));
    }

    @Tag(name = "Tipo de transacciones")
    @PutMapping("/{id}")
    public ResponseEntity<TipoTransaccionDto> updateTipoTransaccion(@PathVariable Long id,@Valid @RequestBody TipoTransaccionDto tipoTransaccionDto){
        return ResponseEntity.ok(tipoTransaccionService.updateTipoTransaccion(id, tipoTransaccionDto));
    }

    @Tag(name = "Tipo de transacciones")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTipoTransaccion(@PathVariable Long id){
        tipoTransaccionService.deleteTipoTransaccion(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Tipo de transaccion eliminado");
    }
}
