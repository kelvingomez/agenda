package com.example.scheduler.controllers;

import com.example.scheduler.dao.AgendaDao;
import com.example.scheduler.models.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AgendaController {

    @Autowired
    private AgendaDao agendaDao;

    @RequestMapping(value="prueba")
    public String prueba(){
        return "prueba de conexion";
    }

    @RequestMapping(value="api/agenda", method = RequestMethod.GET)
    public List<Agenda> getAgenda(){
        return agendaDao.getAgenda();
    }

    @RequestMapping(value="api/agenda" ,method=RequestMethod.POST)
    public void createAgenda(@RequestBody Agenda agenda){
        agendaDao.crear(agenda);
    }

    @RequestMapping(value="api/agenda", method = RequestMethod.PUT)
    public void editAgenda(@RequestBody Agenda agenda){
        agendaDao.editar(agenda);
    }

    @RequestMapping(value = "api/agenda/{id}", method = RequestMethod.DELETE)
    public void deleteAgenda(@PathVariable Long id){
        agendaDao.eliminar(id);
    }

}

