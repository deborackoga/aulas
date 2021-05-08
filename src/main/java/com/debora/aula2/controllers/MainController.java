package com.debora.aula2.controllers;

import com.debora.aula2.model.Pessoa;
import com.debora.aula2.services.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController{

    private final PessoaService pessoaService;

    public MainController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping("/ola")
    public String ola(){
        return "Ola";
    }


    @GetMapping("/pessoa")
    public Pessoa pessoa(){
        return pessoaService.getPessoa();
    }
}
