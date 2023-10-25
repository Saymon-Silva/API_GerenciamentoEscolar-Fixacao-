package net.weg.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Escola {
    private Integer id;
    private String nome;
    @OneToOne
    private Endereco endereco;
    private String email;
    private List<Professor> listaDeProfessores;
    private List<Curso> listaDeCursos;
    @OneToOne(mappedBy = "escola")
    private Diretor diretor;
}
