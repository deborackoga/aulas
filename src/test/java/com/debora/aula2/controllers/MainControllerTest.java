package com.debora.aula2.controllers;

import com.debora.aula2.model.Pessoa;
import com.debora.aula2.services.PessoaService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class MainControllerTest {

    @Test
    void pessoa() {
        //Setup
        PessoaService pessoaService = Mockito.mock(PessoaService.class);
        MainController m = new MainController(pessoaService);

        Pessoa mockedPessoa = new Pessoa("Fernando", 39);
        when(pessoaService.getPessoa()).thenReturn(mockedPessoa);

        // Test
        Pessoa returned = m.pessoa();

        // Assertions
        Pessoa expected = new Pessoa("Fernando", 39);
        assertEquals(expected, returned);
    }
}