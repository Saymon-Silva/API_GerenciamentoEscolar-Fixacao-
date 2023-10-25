package net.weg.api.service;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import net.weg.api.model.Escola;
import net.weg.api.repository.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EscolaService {
    private final EscolaRepository escolaRepository;

    public void save(Escola escola) {
        escolaRepository.save(escola);
    }

    public void delete(Long id) {
        escolaRepository.deleteById(id);
    }

    public Escola findOne(Long id) {
        return escolaRepository.findById(id).get();
    }

    public Collection<Escola> findAll() {
        return escolaRepository.findAll();
    }
}
