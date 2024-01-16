package com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "propietario")
public class Propietario {
    @Id
    @SequenceGenerator(name = "generator_propietario", allocationSize = 1,sequenceName = "seq_propietario_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator_propietario")
    @Column (name = "prop_id")
    private Integer id;
    @Column (name = "prop_cedula")
    private String cedula;
    @Column (name = "prop_nombre")
    private String nombre;
    @Column (name = "prop_apellido")
    private String apellido;
    @OneToOne
    @JoinColumn(name = "prop_cuenta_bancaria")
    private CuentaBancaria cuentaBancaria;

    /////////////////// get set String


    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuentaBancaria=" + cuentaBancaria.getNumero() +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
