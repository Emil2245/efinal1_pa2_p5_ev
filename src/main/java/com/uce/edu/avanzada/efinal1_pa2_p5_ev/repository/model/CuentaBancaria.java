package com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "cuenta_bancaria")
public class CuentaBancaria {
    @Id
    @SequenceGenerator(name = "generator_cuenta_bancaria", allocationSize = 1,sequenceName = "seq_cuenta_bancaria_id")
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "generator_cuenta_bancaria")
    @Column(name = "cuba_id")
    private Integer id;
    @Column(name = "cuba_numero")
    private String numero;
    @Column(name = "cuba_is_corriente")
    private Boolean isCorriente;
    @Column(name = "cuba_saldo")
    private BigDecimal saldo;
    @OneToOne(mappedBy = "cuentaBancaria",cascade = CascadeType.ALL)
    private Propietario propietario;

    @OneToMany(mappedBy = "cuentaOrigen")
    private List<Transferencia> transferenciasOrigen;

    @OneToMany(mappedBy = "cuentaDestino")
    private List<Transferencia> transferenciasDestino;

    //////get set string

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<Transferencia> getTransferenciasOrigen() {
        return transferenciasOrigen;
    }

    public void setTransferenciasOrigen(List<Transferencia> transferenciasOrigen) {
        this.transferenciasOrigen = transferenciasOrigen;
    }

    public List<Transferencia> getTransferenciasDestino() {
        return transferenciasDestino;
    }

    public void setTransferenciasDestino(List<Transferencia> transferenciasDestino) {
        this.transferenciasDestino = transferenciasDestino;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", isCorriente=" + isCorriente +
                ", saldo=" + saldo +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getCorriente() {
        return isCorriente;
    }

    public void setCorriente(Boolean corriente) {
        isCorriente = corriente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
