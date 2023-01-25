package com.videoclub.backend.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name="genero")
public class GeneroEntity {

    @Id
    @Column(name = "codGenero")
    private Integer codGenero;
    @Column(name ="nomGenero")
    private String nomGenero;

    public GeneroEntity() {
    }

    public GeneroEntity(Integer codGenero, String nomGenero){
        this.codGenero = codGenero;
        this.nomGenero = nomGenero;
    }

    public Integer getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(Integer codGenero) {
        this.codGenero = codGenero;
    }

    public String getNomGenero() {
        return nomGenero;
    }

    public void setNomGenero(String nomGenero) {
        this.nomGenero = nomGenero;
    }
}
