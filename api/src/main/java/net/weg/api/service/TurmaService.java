package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Turma;
import net.weg.api.repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TurmaService {
    private final TurmaRepository turmaRepository;

    public void save(Turma turma) {
        turmaRepository.save(turma);
    }

    public void delete(Long id) {
        turmaRepository.deleteById(id);
    }

    public Turma findOne(Long id) {
        return turmaRepository.findById(id).get();
    }

    public Collection<Turma> findAll() {
        return turmaRepository.findAll();
    }
}
