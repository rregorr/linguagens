package com.ankiapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_questao;
    private String pergunta;
    private String resposta;
}
