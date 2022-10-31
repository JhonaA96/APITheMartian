package com.parcial.elMarciano.model;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "actor_picture")
public class ActorPicture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "picture")
    private String picture;

    @Column(name = "file_name")
    private String fileName;

    public ActorPicture() {
    }

    public ActorPicture(Long id) {
        this.id = id;
    }

    public ActorPicture(String picture, String fileName) {
        this.picture = picture;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
