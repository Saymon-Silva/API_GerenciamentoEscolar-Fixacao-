package net.weg.api.controller;

import lombok.AllArgsConstructor;

import net.weg.api.model.Disciplina;
import net.weg.api.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/disciplina")
@AllArgsConstructor
public class DisciplinaControlller {
    private final DisciplinaService disciplinaService;

    @PostMapping
    public void insert(@RequestBody Disciplina disciplina) {
        disciplinaService.save(disciplina);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        disciplinaService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Disciplina disciplina) {
        disciplinaService.save(disciplina);
    }

    @GetMapping("/{id}")
    public Disciplina findOne(@PathVariable(value = "id") Long id) {
        return disciplinaService.findOne(id);
    }

    @GetMapping
    public Collection<Disciplina> findAll() {
        return disciplinaService.findALl();
    }
}
