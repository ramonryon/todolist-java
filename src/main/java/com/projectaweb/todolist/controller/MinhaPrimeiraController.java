package com.projectaweb.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /*
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remove um dado/informação
     * PATCH - Alterar somente uma parte da informação
     */
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
