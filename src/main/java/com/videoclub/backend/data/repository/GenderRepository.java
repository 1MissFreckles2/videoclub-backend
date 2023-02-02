package com.videoclub.backend.data.repository;

import com.videoclub.backend.data.entity.GenderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderRepository extends JpaRepository<GenderEntity, Integer> {
    // primero es tipo y luego id es interface porque tiene los metodos ya listos

   // List<GenderEntity> findByName_gender(String name_gender);
}
