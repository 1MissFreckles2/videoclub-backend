package com.videoclub.backend.data.repository;

import com.videoclub.backend.data.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    List<MovieEntity> findByCodGender(Integer cod_gender); //SEARCH BY CODE OF GENDER
}
