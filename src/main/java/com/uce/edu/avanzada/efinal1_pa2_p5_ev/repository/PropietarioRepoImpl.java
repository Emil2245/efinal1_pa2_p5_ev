package com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.CuentaBancaria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo{
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public CuentaBancaria select(Integer id) {
//        TypedQuery<CuentaBancaria> query = this.entityManager.createQuery("select l from CuentaBancaria l where l.numero = :numero", CuentaBancaria.class);
//        query.setParameter("numero", id);
//        return query.getSingleResult();
//
//    }
//
//    @Override
//    public void insert(CuentaBancaria cuentaBancaria) {
//        this.entityManager.persist(cuentaBancaria);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        CuentaBancaria cuentaBancaria = this.select(id);
//        this.entityManager.remove(cuentaBancaria);
//
//    }
}
