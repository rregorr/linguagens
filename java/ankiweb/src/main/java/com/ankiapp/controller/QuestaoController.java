package com.ankiapp.controller;

import com.ankiapp.model.Questao;
import com.ankiapp.repository.QuestaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta classe é um controller REST
@RequestMapping("/questoes") // URL base para acessar os métodos: /questoes
public class QuestaoController {

    @Autowired // Injeta o repositório automaticamente
    private QuestaoRepository questaoRepository;

    // Listar todas as questões
    @GetMapping
    public List<Questao> listarQuestoes() {
        return questaoRepository.findAll();
    }

    // Cadastrar nova questão
    @PostMapping
    public Questao criarQuestao(@RequestBody Questao questao) {
        return questaoRepository.save(questao);
    }

    // Atualizar questão
    @PutMapping("/{id}")
    public Questao atualizarQuestao(@PathVariable Long id, @RequestBody Questao questaoAtualizada) {
        return questaoRepository.findById(id).map(questao -> {
            questao.setPergunta(questaoAtualizada.getPergunta());
            questao.setResposta(questaoAtualizada.getResposta());
            return questaoRepository.save(questao);
        }).orElse(null);
    }

    // Deletar questão
    @DeleteMapping("/{id}")
    public void deletarQuestao(@PathVariable Long id) {
        questaoRepository.deleteById(id);
    }
}
