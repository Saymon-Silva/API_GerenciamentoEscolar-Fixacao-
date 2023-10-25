package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Curso;
import net.weg.api.model.Diretor;
import net.weg.api.service.CursoService;
import net.weg.api.service.DiretorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/diretor")
@AllArgsConstructor
public class DiretorController {
    private final DiretorService diretorService;

    @PostMapping
    public void insert(@RequestBody Diretor diretor) {
        diretorService.save(diretor);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        diretorService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Diretor diretor) {
        diretorService.save(diretor);
    }

    @GetMapping("/{id}")
    public Diretor findOne(@PathVariable(value = "id") Long id) {
        return diretorService.findOne(id);
    }

    @GetMapping
    public Collection<Diretor> findAll() {
        return diretorService.findAll();
    }
}
