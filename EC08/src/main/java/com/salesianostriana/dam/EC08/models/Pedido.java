package com.salesianostriana.dam.EC08.models;

import lombok.*;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/*
    Elegi una asociación unidireccional porque considero que no es
    conveniente traer todos los datos de los pedidos de cada cliente
 */
@Entity @Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@NaturalIdCache
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NaturalId
    @Column(nullable = false, unique = true)
    private String codPedido;

    private LocalDateTime fechaPedido;

    private LocalDate fechaEntrega;

    private double total;

    @ManyToOne
    @JoinColumn(name = "cliente", foreignKey = @ForeignKey(name = "FK_PEDIDO_CLIENTE"))
    private Cliente cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(codPedido, pedido.codPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPedido);
    }

    public Pedido(String codPedido, LocalDateTime fechaPedido, LocalDate fechaEntrega, double total) {
        this.codPedido = codPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.total = total;
    }
}


