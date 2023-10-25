package net.weg.api.model;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

public class Professor {
    @ManyToOne
    private Escola escola;
    @ManyToMany(mappedBy = "listaDeProfessores")
    private List<Disciplina> listaDeDisciplinas;
}
