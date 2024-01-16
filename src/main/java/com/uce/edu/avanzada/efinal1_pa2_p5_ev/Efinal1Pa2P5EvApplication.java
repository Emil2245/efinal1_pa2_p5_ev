package com.uce.edu.avanzada.efinal1_pa2_p5_ev;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.CuentaBancaria;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Propietario;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Transferencia;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.service.ICuentaBancariaService;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.service.ITransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class Efinal1Pa2P5EvApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Efinal1Pa2P5EvApplication.class, args);
    }

    @Autowired
    private ICuentaBancariaService iCuentaBancariaService;
    @Autowired
    private ITransferenciaService iTransferenciaService;

    @Override
    public void run(String... args) throws Exception {
        CuentaBancaria cuentaOrigen = new CuentaBancaria();
        CuentaBancaria cuentaDestino = new CuentaBancaria();
        cuentaOrigen.setNumero("0");
        cuentaOrigen.setCorriente(true);
        cuentaOrigen.setSaldo(new BigDecimal(8500));
        Propietario propietario1 = new Propietario();
        propietario1.setCedula("54654");
        propietario1.setApellido("h");
        propietario1.setNombre("H");
        cuentaOrigen.setPropietario(propietario1);

        Propietario propietario2 = new Propietario();
        propietario2.setCedula("8888");
        propietario2.setApellido("M");
        propietario2.setNombre("N");

        cuentaDestino.setNumero("2");
        cuentaDestino.setCorriente(true);
        cuentaDestino.setSaldo(new BigDecimal(7000));
        cuentaDestino.setPropietario(propietario2);


        this.iCuentaBancariaService.insert(cuentaOrigen);
        this.iCuentaBancariaService.insert(cuentaDestino);

//        this.iTransferenciaService.transferir("0","2",new BigDecimal(60));

//        List< Transferencia> tr=this.iTransferenciaService.buscarAllTransferencias();
//        tr.stream().forEach(System.out::println);


    }
}
