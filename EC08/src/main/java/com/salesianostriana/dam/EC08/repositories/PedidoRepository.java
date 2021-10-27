package com.salesianostriana.dam.EC08.repositories;

import com.salesianostriana.dam.EC08.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository
        extends JpaRepository<Pedido,Long> {
}
