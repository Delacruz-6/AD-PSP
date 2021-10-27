package com.salesianostriana.dam.EC08.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
Elegi una asociación bidireccional porque crei conveniente traerme todos los datos de
la tabla clienteCorporativo que esta asociada.
 */
@Entity @Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;

    private String departamento;

    private double salarioBruto;

    @OneToMany (mappedBy="empleado")
    @Builder.Default
    private List<ClienteCorporativo> listCorp = new ArrayList<>();

    public Empleado(String nombre, String departamento, double salarioBruto) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salarioBruto = salarioBruto;
    }

    /*
        Helpers de la asociacion empleado 1- 1* cliente corporativo
    */
    public void addClienteCorporativo(ClienteCorporativo c) {
        this.listCorp.add(c);
        c.setEmpleado(this);
    }

    public void removeClienteCorporativo(ClienteCorporativo c) {
        this.listCorp.remove(c);
        c.setEmpleado(null);
    }

}
