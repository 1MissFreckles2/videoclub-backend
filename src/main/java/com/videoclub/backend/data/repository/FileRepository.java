package com.videoclub.backend.data.repository;

import com.videoclub.backend.data.entity.FileEntity;
import com.videoclub.backend.data.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Integer> {

    List<FileEntity> findByCodMovie(Integer codMovie);
}
