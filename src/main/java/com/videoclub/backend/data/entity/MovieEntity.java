package com.videoclub.backend.data.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name =  "cod_movie")
    private Integer cod_movie;
    @Column(name =  "descript")
    private String descript;
    @Column(name =  "title")
    private String title;
    @Column(name =  "director")
    private String director;
    @Column(name =  "actors")
    private String actors;
    @Column(name =  "cod_gender")
    private Integer codGender;

    public MovieEntity() {

    }


    public MovieEntity(Integer cod_movie, String descript, String title, String director, String actors, Integer codGender) {
        this.cod_movie = cod_movie;
        this.descript = descript;
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.codGender = codGender;
    }

    public Integer getCod_movie() {
        return cod_movie;
    }

    public void setCod_movie(Integer cod_movie) {
        this.cod_movie = cod_movie;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Integer getCodGender() {
        return codGender;
    }

    public void setCodGender(Integer codGender) {
        this.codGender = codGender;
    }
}
