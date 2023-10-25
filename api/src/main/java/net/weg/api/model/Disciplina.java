package net.weg.api.model;

import jakarta.persistence.ManyToMany;

import java.util.List;

public class Disciplina {
    private Long id;
    private String nome;
    @ManyToMany
    private List<Professor> listaDeProfessores;
}
