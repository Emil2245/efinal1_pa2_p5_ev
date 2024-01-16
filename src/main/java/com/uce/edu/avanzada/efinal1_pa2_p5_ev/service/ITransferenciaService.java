package com.uce.edu.avanzada.efinal1_pa2_p5_ev.service;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.CuentaBancaria;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Transferencia;

import java.math.BigDecimal;
import java.util.List;

public interface ITransferenciaService {
    List<Transferencia> buscarAllTransferencias();
    void guardar(Transferencia transferencia);
    void transferir(String ctaOrigen, String ctaDestino, BigDecimal monto);

}
