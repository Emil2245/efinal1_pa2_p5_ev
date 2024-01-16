package com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Transferencia;

import java.util.List;

public interface ITransferenciaRepo {
    List<Transferencia> selectAllTransferencias();
    void insert(Transferencia transferencia);
}
