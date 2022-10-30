package com.parcial.elMarciano.model;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lasta_name")
    private String lastName;

    @Column(name = "profesion")
    private String profesion;

    @Column(name = "rol")
    private String rol;

    @Column(name = "days_out_of_earth")
    private Integer daysOutOfEarth;

    @JoinColumn(name="IdActor", referencedColumnName = "Id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Actor actor;

    public Character(){
        //Default constructor
    }

    public Character(Long id) {
        this.id = id;
    }

    public Character(String name, String lastName, String profesion, String rol, Integer daysOutOfEarth, Actor actor) {
        this.name = name;
        this.lastName = lastName;
        this.profesion = profesion;
        this.rol = rol;
        this.daysOutOfEarth = daysOutOfEarth;
        this.actor = actor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getDaysOutOfEarth() {
        return daysOutOfEarth;
    }

    public void setDaysOutOfEarth(Integer daysOutOfEarth) {
        this.daysOutOfEarth = daysOutOfEarth;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
