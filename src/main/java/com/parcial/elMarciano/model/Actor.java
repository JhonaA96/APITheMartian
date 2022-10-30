package com.parcial.elMarciano.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.File;
import java.net.URL;
import java.util.Date;

@Entity
@Table(name = "actores")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "born_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date bornDate;

    @Column(name = "awards")
    private String awards;

    @Column(name = "movies")
    private String movies;

    @JoinColumn(name = "idActorPicture", referencedColumnName = "Id")
    @OneToOne(fetch = FetchType.LAZY)
    private ActorPicture picture;

    @Column(name = "web", nullable = true)
    private String web;

    @Column(name = "instagram")
    private String insta;

    public Actor(){
        //Default constructor
    }

    public Actor(Long id) {
        this.id = id;
    }

    public Actor(String firstName, String lastName, Date bornDate, String awards, String movies, ActorPicture picture, String web, String insta) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.awards = awards;
        this.movies = movies;
        this.picture = picture;
        this.web = web;
        this.insta = insta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public ActorPicture getPicture() {
        return picture;
    }

    public void setPicture(ActorPicture picture) {
        this.picture = picture;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getInsta() {
        return insta;
    }

    public void setInsta(String insta) {
        this.insta = insta;
    }
}
