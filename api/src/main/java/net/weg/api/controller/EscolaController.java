package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Escola;
import net.weg.api.service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/escola")
@AllArgsConstructor
public class EscolaController {
    private final EscolaService escolaService;

    @PostMapping
    public void insert(@RequestBody Escola escola) {
        escolaService.save(escola);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        escolaService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Escola escola) {
        escolaService.save(escola);
    }

    @GetMapping("/{id}")
    public Escola findOne(@PathVariable(value = "id") Long id) {
        return escolaService.findOne(id);
    }

    @GetMapping
    public Collection<Escola> findAll() {
        return escolaService.findAll();
    }
}
