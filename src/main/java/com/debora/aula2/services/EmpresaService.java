package com.debora.aula2.services;

import com.debora.aula2.model.Empresa;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    public Empresa getEmpresa() {
        return new Empresa("789", "Empresa nova");
    }
}
