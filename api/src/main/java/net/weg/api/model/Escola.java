package net.weg.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String nome;
    @OneToOne
    private Endereco endereco;
    private String email;
    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;
    @OneToMany
    private List<Curso> listaDeCursos;
    @OneToOne(mappedBy = "escola")
    @JsonIgnore
    private Diretor diretor;
}
