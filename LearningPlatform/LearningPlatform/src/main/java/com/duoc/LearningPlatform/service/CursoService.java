package com.duoc.LearningPlatform.service;

import com.duoc.LearningPlatform.model.Curso;
import com.duoc.LearningPlatform.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> obtenerTodos() {
        return cursoRepository.findAll();
    }

    public Curso obtenerPorId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + id));
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso actualizar(Long id, Curso cursoActualizado) {
        Curso curso = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + id));

        curso.setNombre(cursoActualizado.getNombre());
        curso.setDescripcion(cursoActualizado.getDescripcion());
        curso.setProfesorId(cursoActualizado.getProfesorId());

        return cursoRepository.save(curso);
    }

    public void eliminar(Long id) {
        Curso curso = cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + id));

        cursoRepository.delete(curso);
    }
}