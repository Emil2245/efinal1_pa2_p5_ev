package com.uce.edu.avanzada.efinal1_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.ICuentaBancariaRepo;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.ITransferenciaRepo;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.CuentaBancaria;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Transferencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
    @Autowired
    private ITransferenciaRepo iTransferenciaRepo;
    @Autowired
    private ICuentaBancariaRepo iCuentaBancariaRepo;

    @Override
    public List<Transferencia> buscarAllTransferencias() {
        return this.iTransferenciaRepo.selectAllTransferencias();
    }

    @Override
    public void guardar(Transferencia transferencia) {
        this.iTransferenciaRepo.insert(transferencia);
    }

    @Override
    public void transferir(String ctaOrigen, String ctaDestino, BigDecimal monto) {
        CuentaBancaria cuentaOrigen= new CuentaBancaria();
        CuentaBancaria cuentaDestino=cuentaOrigen;

        //verificar saldo
        BigDecimal saldoOrigen = cuentaOrigen.getSaldo();
        BigDecimal saldoDestino =cuentaDestino.getSaldo();
        BigDecimal comision =monto.multiply(new BigDecimal(0.1));

        if (1 != saldoOrigen.compareTo(new BigDecimal(0))){
            System.out.println("saldo insuficiente");
            return;
        }
        Transferencia transferencia = new Transferencia();
        transferencia.setCuentaDestino(cuentaDestino);
        transferencia.setCuentaOrigen(cuentaOrigen);
        transferencia.setComision(comision);
        transferencia.setFecha(LocalDate.now());
        transferencia.setMonto(monto);

        saldoOrigen=saldoOrigen.subtract(monto);
        saldoOrigen=saldoOrigen.subtract(comision);

        saldoDestino=saldoDestino.add(monto);

        cuentaOrigen.setSaldo(saldoOrigen);
        cuentaDestino.setSaldo(saldoDestino);

        this.iCuentaBancariaRepo.update(cuentaDestino);
        this.iCuentaBancariaRepo.update(cuentaDestino);

        this.iTransferenciaRepo.insert(transferencia);

        System.out.println("Transferencia Realizada");

    }

}
