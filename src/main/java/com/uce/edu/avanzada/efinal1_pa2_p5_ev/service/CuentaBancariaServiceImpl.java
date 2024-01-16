package com.uce.edu.avanzada.efinal1_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.ICuentaBancariaRepo;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.CuentaBancaria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
    @Autowired
    private ICuentaBancariaRepo iCuentaBancariaRepo;

    @Override
    public CuentaBancaria select(String id) {
        return this.iCuentaBancariaRepo.select(id);
    }

    @Override
    public void insert(CuentaBancaria cuentaBancaria) {
        this.iCuentaBancariaRepo.insert(cuentaBancaria);

    }

    @Override
    public void update(CuentaBancaria cuentaBancaria) {
        this.iCuentaBancariaRepo.update(cuentaBancaria);

    }

    @Override
    public void delete(String id) {
        this.iCuentaBancariaRepo.delete(id);
    }
}
