package com.ankiapp.model;

import java.lang.annotation.Inherited;
import javax.annotation.processing.Generated;
import jakarta.persistence.*;
import lombok.Data;

@Entity //define que a classe será mapeada para o banco de dados
@Data //@Data (do Lombok) gera getters, setters e toString automaticamente
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // @Id + @GeneratedValue criam o campo autoincremento
//Se não usássemos IDENTITY, teríamos que usar outro tipo de estratégia, como SEQUENCE (mais comum em Oracle/PostgreSQL) 
// ou AUTO (delegado ao provedor JPA).🔎 No caso do SQLite, o uso correto é IDENTITY porque ele não tem suporte a SEQUENCE.

    private Long id_pessoa;
    private String nome;

}
