package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Cadastro;
import br.com.exercicios.spring.exemplo01.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("api/exemplo03")

public class exercicioPost03 {


        @PostMapping("cadastro")
        public Cadastro cadastrarAluno(@RequestBody Cadastro cadastro){
            return cadastro;
        }
    }

