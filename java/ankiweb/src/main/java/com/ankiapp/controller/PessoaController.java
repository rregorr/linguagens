package com.ankiapp.controller;

import com.ankiapp.model.Pessoa;
import com.ankiapp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired; // Permite a injeção automática de dependências.
import org.springframework.web.bind.annotation.*; //Importa todas as anotações de controlador REST (@RestController, @GetMapping, etc.)

import java.util.List;

@RestController //Informa ao Spring que essa classe é um controlador REST (retorna JSON diretamente).
@RequestMapping("/pessoas") // Define a URL base para todos os endpoints deste controller: http://localhost:8080/pessoas
public class PessoaController {

    @Autowired //Injeção automática do repositório PessoaRepository pelo Spring.
    private PessoaRepository pessoaRepository; // Repositório usado para interagir com o banco de dados (CRUD de Pessoa).

    @PostMapping // Mapeia requisições HTTP POST para este método.
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa); // Salva a nova pessoa recebida no corpo da requisição e retorna o objeto salvo.
    }
    
    // Listar todas as pessoas
    @GetMapping // Mapeia requisições HTTP GET sem parâmetros (lista tudo).
    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll(); // Retorna todas as pessoas do banco de dados.
    }

    // Buscar uma pessoa por ID
    @GetMapping("/{id}") // Mapeia requisições GET com um ID na URL, ex: /pessoas/3
    public Pessoa buscarPessoaPorId(@PathVariable Long id) {
        return pessoaRepository.findById(id).orElse(null); // Busca por ID. Se não encontrar, retorna null.
    }


    // Atualizar pessoa
    @PutMapping("/{id}") // Mapeia requisições HTTP PUT para a URL /pessoas/{id}
    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) {
        // Busca a pessoa no banco pelo ID informado
        return pessoaRepository.findById(id).map(pessoa -> {
        // Atualiza o nome da pessoa encontrada com o valor enviado no corpo da requisição
            pessoa.setNome(pessoaAtualizada.getNome());
        // Salva e retorna a pessoa atualizada
            return pessoaRepository.save(pessoa);
        }).orElse(null);  // Caso não encontre a pessoa, retorna null
    }

    // Deletar pessoa
    @DeleteMapping("/{id}") // Mapeia requisições HTTP DELETE para a URL /pessoas/{id}
    public void deletarPessoa(@PathVariable Long id) {
        // Remove a pessoa com o ID especificado do banco de dados
        pessoaRepository.deleteById(id);
    }
}
