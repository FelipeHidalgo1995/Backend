package com.duoc.LearningPlatform.repository;

import com.duoc.LearningPlatform.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}