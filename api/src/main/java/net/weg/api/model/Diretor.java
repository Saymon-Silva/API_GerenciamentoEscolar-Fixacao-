package net.weg.api.model;

import jakarta.persistence.OneToOne;

public class Diretor {
    @OneToOne
    private Escola escola;
}
