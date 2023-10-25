package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Disciplina;
import net.weg.api.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DisciplinaService {
    private final DisciplinaRepository disciplinaRepository;

    public void save(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    public void delete(Long id) {
        disciplinaRepository.deleteById(id);
    }

    public Disciplina findOne(Long id) {
        return disciplinaRepository.findById(id).get();
    }

    public Collection<Disciplina> findALl() {
        return disciplinaRepository.findAll();
    }
}
