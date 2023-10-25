package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Curso;
import net.weg.api.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CursoService {
    private final CursoRepository cursoRepository;

    public void save(Curso curso) {
        cursoRepository.save(curso);
    }

    public void delete(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso findOne(Long id) {
        return cursoRepository.findById(id).get();
    }

    public Collection<Curso> findAll() {
        return cursoRepository.findAll();
    }
}
