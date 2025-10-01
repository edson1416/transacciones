package com.edsonsarmiento.transacciones.repository;

import com.edsonsarmiento.transacciones.entity.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionesRepository extends JpaRepository<Transacciones, Long> {
}
