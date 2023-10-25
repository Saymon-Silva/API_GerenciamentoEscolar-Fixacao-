package net.weg.api.controller;

import lombok.AllArgsConstructor;
import net.weg.api.model.Aluno;
import net.weg.api.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/aluno")
@AllArgsConstructor
public class AlunoController {
    private final AlunoService alunoService;

    @PostMapping
    public void insert(@RequestBody Aluno aluno) {
        alunoService.save(aluno);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id) {
        alunoService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Aluno aluno) {
        alunoService.save(aluno);
    }

    @GetMapping("/{id}")
    public Aluno findOne(@PathVariable(value = "id") Long id){
        return alunoService.findOne(id);
    }
    @GetMapping
    public Collection<Aluno> findAll(){
        return alunoService.findAll();
    }
}
