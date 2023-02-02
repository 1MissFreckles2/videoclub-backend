package com.videoclub.backend.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name="gender")
public class GenderEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "cod_gender")
    private Integer cod_gender;
    @Column(name ="name_gender")
    private String name_gender;


    public GenderEntity() {
    }

    public GenderEntity(Integer cod_gender, String name_gender){
        this.cod_gender = cod_gender;
        this.name_gender = name_gender;
    }

    public Integer getCod_gender() {
        return cod_gender;
    }

    public void setCod_gender(Integer cod_gender) {
        this.cod_gender = cod_gender;
    }

    public String getName_gender() {
        return name_gender;
    }

    public void setName_gender(String name_gender) {
        this.name_gender = name_gender;
    }
}
