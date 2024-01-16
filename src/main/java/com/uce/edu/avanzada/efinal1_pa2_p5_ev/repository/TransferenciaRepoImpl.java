package com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository;

import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Transferencia;
import com.uce.edu.avanzada.efinal1_pa2_p5_ev.repository.model.Transferencia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TransferenciaRepoImpl implements ITransferenciaRepo{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Transferencia> selectAllTransferencias() {
        TypedQuery<Transferencia> query = this.entityManager.createQuery("select l from Transferencia l", Transferencia.class);
        return query.getResultList();
    }

    @Override
    public void insert(Transferencia transferencia) {
        this.entityManager.persist(transferencia);
    }

}
