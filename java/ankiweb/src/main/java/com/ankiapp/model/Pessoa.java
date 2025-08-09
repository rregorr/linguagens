//GPT do Projeto: https://chatgpt.com/c/6888af36-4754-8332-95df-76d8971e3fdc
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

    private Long idPessoa; //Em Java, tipos primitivos como long NÃO podem ser armazenados diretamente 
    //em coleções como ArrayList (coleções só aceitam objetos, como Long, Integer, Double, etc).
    private String nome;  
/* O processo automático de conversão entre tipos primitivos e wrappers é chamado de autoboxing e unboxing. */


/* Aqui normalmente ficariam os getters e setters, mas como usamos @Data do Lombok, eles são gerados automaticamente.
   Isso reduz a verbosidade do código e melhora a legibilidade. 
   Além disso, o Lombok também gera o método toString() automaticamente, o que facilita a depuração e o log de 
   objetos dessa classe.
    O Lombok é uma biblioteca que ajuda a reduzir o boilerplate em classes Java, especialmente em POJOs (Plain Old Java Objects).
"A anotação @Data da biblioteca Lombok substitui a necessidade de se declarar manualmente os métodos de acesso, 
como getters e setters, em uma classe Java POJO."
    Isso é especialmente útil em projetos maiores, onde muitas classes precisam de getters e setters para seus campos.
 */
}
