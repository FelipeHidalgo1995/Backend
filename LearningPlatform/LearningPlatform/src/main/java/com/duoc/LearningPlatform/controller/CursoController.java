package com.duoc.LearningPlatform.controller;

import com.duoc.LearningPlatform.model.Curso;
import com.duoc.LearningPlatform.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> obtenerTodos() {
        return cursoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Curso obtenerPorId(@PathVariable Long id) {
        return cursoService.obtenerPorId(id);
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return cursoService.guardar(curso);
    }

    @PutMapping("/{id}")
    public Curso actualizar(@PathVariable Long id, @RequestBody Curso curso) {
        return cursoService.actualizar(id, curso);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        cursoService.eliminar(id);
        return "Curso eliminado correctamente";
    }
}