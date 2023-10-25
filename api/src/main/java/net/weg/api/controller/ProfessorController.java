package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Professor;
import net.weg.api.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/professor")
@AllArgsConstructor
public class ProfessorController {
    private final ProfessorService professorService;

    @PostMapping
    public void insert(@RequestBody Professor professor) {
        professorService.save(professor);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        professorService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Professor professor) {
        professorService.save(professor);
    }

    @GetMapping("/{id}")
    public Professor findOne(@PathVariable(value = "id") Long id) {
        return professorService.findOne(id);
    }

    @GetMapping
    public Collection<Professor> findAll() {
        return professorService.findAll();
    }
}
