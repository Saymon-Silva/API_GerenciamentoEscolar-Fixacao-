package net.weg.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    private Integer id;
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne
    private Endereco endereco;
}
