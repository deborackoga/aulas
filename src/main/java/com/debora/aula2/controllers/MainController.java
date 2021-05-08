package com.debora.aula2.controllers;

import com.debora.aula2.model.Empresa;
import com.debora.aula2.model.Pessoa;
import com.debora.aula2.services.EmpresaService;
import com.debora.aula2.services.PessoaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController{

    private final PessoaService pessoaService;

    private final EmpresaService empresaService;

    public MainController(PessoaService pessoaService, EmpresaService empresaService){
        this.pessoaService = pessoaService;
        this.empresaService = empresaService;
    }

    @GetMapping("/ola")
    public String ola(){
        return "Ola";
    }


    @GetMapping("/pessoa")
    public Pessoa pessoa(){
        return pessoaService.getPessoa();
    }

    @GetMapping("/empresa")
    public Empresa empresa(){
        return empresaService.getEmpresa();
    }
}
