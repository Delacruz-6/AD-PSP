package com.salesianostriana.dam.EC08.services;


import com.salesianostriana.dam.EC08.models.Cliente;
import com.salesianostriana.dam.EC08.repositories.ClienteRepository;
import com.salesianostriana.dam.EC08.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService
        extends BaseService<Cliente, Long, ClienteRepository> {
}
