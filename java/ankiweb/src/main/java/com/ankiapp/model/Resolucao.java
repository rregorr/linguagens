package com.ankiapp.model;

import jakarta.persistence.*;
import lombok.Data;

/*“Nesta entidade Resolucao, existe um campo chamado pessoa que representa um relacionamento do tipo Muitos-para-Um com a entidade 
Pessoa. E no banco de dados, isso será representado por uma coluna chamada id_pessoa.”
*/
@Entity
@Data // Lombok gera getters/setters, toString, etc.
public class Resolucao {

  @Id // Define a chave primária
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idResolucao;

  @ManyToOne // Indica relacionamento muitos-para-um com Pessoa e Questao. Muitas resoluções
             // podem ser feitas pela mesma pessoa.
  @JoinColumn(name = "id_pessoa", nullable = false) // Especifica o nome da coluna estrangeira no banco
  private Pessoa pessoa;

  @ManyToOne
  @JoinColumn(name = "id_questao", nullable = false)
  private Questao questao;
  private String respostaDada;
  private Boolean correta;

  /*
   * A entidade Resolucao tem um atributo questao do tipo Questao (classe Java). O
   * JPA vai gerar na tabela resolucao uma coluna
   * chamada id_questao. Essa coluna será uma chave estrangeira (FK) que aponta
   * para questao(id_questao).
   */

}
