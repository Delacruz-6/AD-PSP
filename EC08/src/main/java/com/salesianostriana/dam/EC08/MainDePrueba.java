package com.salesianostriana.dam.EC08;


import com.salesianostriana.dam.EC08.models.ClienteCorporativo;
import com.salesianostriana.dam.EC08.models.ClienteParticular;
import com.salesianostriana.dam.EC08.models.Empleado;
import com.salesianostriana.dam.EC08.models.Pedido;
import com.salesianostriana.dam.EC08.services.ClienteService;
import com.salesianostriana.dam.EC08.services.EmpleadoService;
import com.salesianostriana.dam.EC08.services.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ClienteService cService;
    private final EmpleadoService eService;
    private final PedidoService pService;

    @PostConstruct
    public void test() {



        ClienteCorporativo clienteCorp= ClienteCorporativo.builder()
                .nombre(("Cristiano"))
                .apellidos("Ronaldo")
                .email("cr7@gmail.com")
                .direccion("AVD del paraiso 33")
                .codigoPostal(41010)
                .nombreEmpresa("Insparya Hair Medical Clinic")
                .cif("B88066642")
                .build();

        cService.save(clienteCorp);


        Empleado empleado= Empleado.builder()
                .nombre("Pepe")
                .departamento("Averias")
                .salarioBruto(1800.00)
                .build();

        eService.save(empleado);

        empleado.addClienteCorporativo(clienteCorp);


        Pedido pedido= Pedido.builder()
                .codPedido("DGF87346FH")
                .total(33.99)
                .cliente(clienteCorp)
                .fechaEntrega(LocalDate.now().plus(5,ChronoUnit.DAYS))
                .fechaPedido(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .build();

        pService.save(pedido);


        ClienteParticular clientePar= ClienteParticular.builder()
                .nombre("Jerry")
                .apellidos("Maguire")
                .dni("25464783H")
                .codigoPostal(85305)
                .direccion("1 Cardinals Dr, Glendale")
                .email("showMeTheMoney@gmail.com")
                .build();

        cService.edit(clientePar);

        System.out.println("------------------Cliente corporativo------------------");
        System.out.println("Nombre: " + clienteCorp.getNombre());
        System.out.println("Empresa: " + clienteCorp.getNombreEmpresa());
        System.out.println("CIF: " + clienteCorp.getCif());
        System.out.println("Direccion: " + clienteCorp.getDireccion());
        System.out.println("Empleado: " + clienteCorp.getEmpleado().getNombre());
        System.out.println("Departamento del empleado: " + clienteCorp.getEmpleado().getDepartamento());
        System.out.println("Sueldo bruto/mes del empleado: " + clienteCorp.getEmpleado().getSalarioBruto()+"€");

        System.out.println("------------------Pedido------------------");
        System.out.println("Quien realizo el pedido: " + pedido.getCliente().getNombre());
        System.out.println("Fecha pedido: " + pedido.getFechaPedido());
        System.out.println("Fecha llegada: " + pedido.getFechaEntrega());
        System.out.println("Total: " + pedido.getTotal()+"€");

        System.out.println("------------------Cliente particular------------------");
        System.out.println("Nombre: " + clientePar.getNombre());
        System.out.println("DNI: " + clientePar.getDni());
        System.out.println("Email: " + clientePar.getEmail());
        System.out.println("Direccion: " + clientePar.getDireccion());


    }
}