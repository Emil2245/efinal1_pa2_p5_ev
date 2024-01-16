package com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transferencia")
public class Transferencia {
    @Id
    @SequenceGenerator(name = "generator_transferencia", allocationSize = 1,sequenceName = "seq_transferencia_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_transferencia")
    @Column(name = "tran_id")
    private Integer id;
    @Column(name = "tran_fecha")
    private LocalDate fecha;
    @Column(name = "tran_monto")
    private BigDecimal monto;
    @Column(name = "tran_comision")
    private BigDecimal comision;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tran_cuenta_origen")
    private CuentaBancaria cuentaOrigen;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tran_cuenta_destino")
    private CuentaBancaria cuentaDestino;


    //////////////////

    @Override
    public String toString() {
        return "Transferencia{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", comision=" + comision +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
}
