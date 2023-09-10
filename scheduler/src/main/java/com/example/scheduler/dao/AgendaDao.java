package com.example.scheduler.dao;

import com.example.scheduler.models.Agenda;

import java.util.List;

public interface AgendaDao {
    List<Agenda> getAgenda();

    void eliminar(Long id);

    void crear(Agenda agenda);

    void editar(Agenda agenda);
}
