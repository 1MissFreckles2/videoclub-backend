package com.videoclub.backend.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name="file")
public class FileEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "cod_file")
    private Integer cod_file;
    @Column(name = "name_file")
    private String name_file;
    @Column(name = "file_route")
    private String file_route;
    @Column(name = "cod_movie")
    private Integer cod_movie;


    public FileEntity() {
    }

    public FileEntity(Integer cod_file, String name_file, String file_route, Integer cod_movie) {
        this.cod_file = cod_file;
        this.name_file = name_file;
        this.file_route = file_route;
        this.cod_movie = cod_movie;
    }

    public Integer getCod_file() {
        return cod_file;
    }

    public void setCod_file(Integer cod_file) {
        this.cod_file = cod_file;
    }

    public String getName_file() {
        return name_file;
    }

    public void setName_file(String name_file) {
        this.name_file = name_file;
    }

    public String getFile_route() {
        return file_route;
    }

    public void setFile_route(String file_route) {
        this.file_route = file_route;
    }

    public Integer getCod_movie() {
        return cod_movie;
    }

    public void setCod_movie(Integer cod_movie) {
        this.cod_movie = cod_movie;
    }
}
