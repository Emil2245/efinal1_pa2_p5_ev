package com.uce.edu.avanzada.efinal1_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.CuentaBancaria;

public interface ICuentaBancariaService {
    CuentaBancaria select(String id);
    void insert(CuentaBancaria cuentaBancaria);
    void update (CuentaBancaria cuentaBancaria);
    void delete(String id);
}
