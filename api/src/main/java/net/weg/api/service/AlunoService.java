package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Aluno;
import net.weg.api.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public void save(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno findOne(Long id) {
        return alunoRepository.findById(id).get();
    }

    public Collection<Aluno> findAll() {
        return alunoRepository.findAll();
    }
}
