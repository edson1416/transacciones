package com.edsonsarmiento.transacciones.repository;

import com.edsonsarmiento.transacciones.entity.TipoTransaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoTransaccionRepository extends JpaRepository<TipoTransaccion,Long> {
}
