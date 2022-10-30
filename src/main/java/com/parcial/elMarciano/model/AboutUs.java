package com.parcial.elMarciano.model;

import javax.persistence.*;

@Entity
@Table(name = "about_us")
public class AboutUs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "about")
    private String about;

    public AboutUs() {
    }

    public AboutUs(Long id) {
        this.id = id;
    }

    public AboutUs(String nombre, String about) {
        this.nombre = nombre;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
