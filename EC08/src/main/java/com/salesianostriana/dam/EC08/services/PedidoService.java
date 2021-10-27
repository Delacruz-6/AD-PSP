package com.salesianostriana.dam.EC08.services;


import com.salesianostriana.dam.EC08.models.Pedido;
import com.salesianostriana.dam.EC08.repositories.PedidoRepository;
import com.salesianostriana.dam.EC08.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PedidoService
        extends BaseService<Pedido, Long, PedidoRepository> {
}
