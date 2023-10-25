package net.weg.api.service;

import lombok.AllArgsConstructor;
import net.weg.api.model.Diretor;
import net.weg.api.repository.DiretorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DiretorService {
    private final DiretorRepository diretorRepository;

    public void save(Diretor diretor) {
        diretorRepository.save(diretor);
    }

    public void delete(Long id) {
        diretorRepository.deleteById(id);
    }

    public Diretor findOne(Long id) {
        return diretorRepository.findById(id).get();
    }

    public Collection<Diretor> findAll() {
        return diretorRepository.findAll();
    }
}
