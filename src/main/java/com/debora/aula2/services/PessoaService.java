package com.debora.aula2.services;

import com.debora.aula2.model.Pessoa;
import com.debora.aula2.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa getPessoa() {
        return pessoaRepository.findAll().get(0);
    }
}
