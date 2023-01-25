package com.videoclub.backend.data.repository;

import com.videoclub.backend.data.entity.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<GeneroEntity, Integer> {
    // primero es tipo y luego id es interface porque tiene los metodos ya listos

}
