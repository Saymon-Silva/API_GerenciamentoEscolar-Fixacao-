package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Professor;
import net.weg.api.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public void save(Professor professor){
        professorRepository.save(professor);
    }
    public void delete(Long id){
        professorRepository.deleteById(id);
    }
    public Professor findOne(Long id){
        return professorRepository.findById(id).get();
    }
    public Collection<Professor> findAll(){
        return professorRepository.findAll();
    }
}
