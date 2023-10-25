package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Turma;
import net.weg.api.service.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequestMapping("/turma")
@AllArgsConstructor
public class TurmaController {
    private final TurmaService turmaService;

    @PostMapping
    public void insert(@RequestBody Turma turma) {
        turmaService.save(turma);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        turmaService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Turma turma) {
        turmaService.save(turma);
    }

    @GetMapping("/{id}")
    public Turma findOne(@PathVariable(value = "id") Long id) {
        return turmaService.findOne(id);
    }

    @GetMapping
    public Collection<Turma> findAll() {
        return turmaService.findAll();
    }
}
