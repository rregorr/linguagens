package com.ankiapp.repository;

import com.ankiapp.ankiapp.model.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
}
