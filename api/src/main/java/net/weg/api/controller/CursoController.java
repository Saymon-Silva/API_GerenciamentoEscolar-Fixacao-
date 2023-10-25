package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Curso;
import net.weg.api.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/curso")
@AllArgsConstructor
public class CursoController {
    private final CursoService cursoService;

    @PostMapping
    public void insert(@RequestBody Curso curso) {
        cursoService.save(curso);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        cursoService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Curso curso) {
        cursoService.save(curso);
    }

    @GetMapping("/{id}")
    public Curso findOne(@PathVariable(value = "id") Long id) {
        return cursoService.findOne(id);
    }

    @GetMapping
    public Collection<Curso> findAll() {
        return cursoService.findAll();
    }
}
