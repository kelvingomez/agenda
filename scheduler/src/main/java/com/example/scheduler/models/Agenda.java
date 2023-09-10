package com.example.scheduler.models;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "dates")
@ToString
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Getter@Setter
    private Integer id;

    @Column(name="asunto")
    @Getter@Setter
    private String asunto;

    @Column(name="fecha")
    @Getter@Setter
    private Date fecha;

    @Column(name="lugar")
    @Getter@Setter
    private String lugar;

    @Column(name="duracion")
    @Getter@Setter
    private Integer duracion;
}
