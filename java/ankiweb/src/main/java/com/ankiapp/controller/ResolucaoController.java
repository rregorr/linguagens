package com.ankiapp.controller;

import com.ankiapp.model.Resolucao;
import com.ankiapp.repository.ResolucaoRepository;
import com.ankiapp.repository.PessoaRepository;
import com.ankiapp.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resolucoes")
public class ResolucaoController {

    @Autowired
    private ResolucaoRepository resolucaoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private QuestaoRepository questaoRepository;

    // Listar todas as resoluções
    @GetMapping
    public List<Resolucao> listarResolucoes() {
        return resolucaoRepository.findAll();
    }

    // Cadastrar nova resolução
    @PostMapping
    public Resolucao criarResolucao(@RequestBody Resolucao resolucao) {
        // Garante que pessoa e questão existem antes de salvar
        pessoaRepository.findById(resolucao.getPessoa().getIdPessoa())
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));

        questaoRepository.findById(resolucao.getQuestao().getIdQuestao())
                .orElseThrow(() -> new RuntimeException("Questão não encontrada"));

        return resolucaoRepository.save(resolucao);
    }

    // Atualizar resolução
    @PutMapping("/{id}")
    public Resolucao atualizarResolucao(@PathVariable Long id, @RequestBody Resolucao novaResolucao) {
        return resolucaoRepository.findById(id).map(resolucao -> {
            resolucao.setRespostaDada(novaResolucao.getRespostaDada());
            resolucao.setCorreta(novaResolucao.getCorreta());
            return resolucaoRepository.save(resolucao);
        }).orElse(null);
    }

    // Deletar resolução
    @DeleteMapping("/{id}")
    public void deletarResolucao(@PathVariable Long id) {
        resolucaoRepository.deleteById(id);
    }
}
