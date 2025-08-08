package com.ankiapp.controller;

import com.ankiapp.model.Pessoa;
import com.ankiapp.repository.PessoaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PessoaControllerTest {

    @Mock
    private PessoaRepository pessoaRepository;

    @InjectMocks
    private PessoaController pessoaController;

    public PessoaControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListarPessoas() {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdPessoa(1L);
        pessoa1.setNome("João");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setIdPessoa(2L);
        pessoa2.setNome("Maria");

        when(pessoaRepository.findAll()).thenReturn(Arrays.asList(pessoa1, pessoa2));

        List<Pessoa> resultado = pessoaController.listarPessoas();

        assertEquals(2, resultado.size());
        assertEquals("João", resultado.get(0).getNome());
        verify(pessoaRepository, times(1)).findAll();
    }
}
