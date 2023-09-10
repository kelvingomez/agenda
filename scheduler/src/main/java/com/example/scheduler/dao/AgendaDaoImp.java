package com.example.scheduler.dao;

import com.example.scheduler.models.Agenda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AgendaDaoImp implements AgendaDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Agenda> getAgenda() {
        String query = "FROM Agenda";
        List<Agenda> resultado =entityManager.createQuery(query).getResultList();
        return resultado;
    }

    @Override
    public void eliminar(Long id) {
        Agenda agenda = entityManager.find(Agenda.class, id);
        entityManager.remove(agenda);
    }

    @Override
    public void crear(Agenda agenda) {
        entityManager.merge(agenda);
    }

    @Override
    public void editar(Agenda agenda) {
        entityManager.merge(agenda);
    }

}
