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
    private Integer descript;
    @Column(name =  "title")
    private Integer title;
    @Column(name =  "director")
    private Integer director;
    @Column(name =  "actors")
    private Integer actors;
    @Column(name =  "cod_gender")
    private Integer cod_gender;

    public MovieEntity() {

    }

    public MovieEntity(Integer cod_movie, Integer descript, Integer title, Integer director, Integer actors, Integer cod_gender) {
        this.cod_movie = cod_movie;
        this.descript = descript;
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.cod_gender = cod_gender;
    }

    public Integer getCod_movie() {
        return cod_movie;
    }

    public void setCod_movie(Integer cod_movie) {
        this.cod_movie = cod_movie;
    }

    public Integer getDescript() {
        return descript;
    }

    public void setDescript(Integer descript) {
        this.descript = descript;
    }

    public Integer getTitle() {
        return title;
    }

    public void setTitle(Integer title) {
        this.title = title;
    }

    public Integer getDirector() {
        return director;
    }

    public void setDirector(Integer director) {
        this.director = director;
    }

    public Integer getActors() {
        return actors;
    }

    public void setActors(Integer actors) {
        this.actors = actors;
    }

    public Integer getCod_gender() {
        return cod_gender;
    }

    public void setCod_gender(Integer cod_gender) {
        this.cod_gender = cod_gender;
    }
}
