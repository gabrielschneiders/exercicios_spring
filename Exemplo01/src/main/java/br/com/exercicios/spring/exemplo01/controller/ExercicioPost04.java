package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Cadastro;
import br.com.exercicios.spring.exemplo01.entity.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("api/exemplo04")

public class ExercicioPost04 {

        @PostMapping("mensagem")
        public Mensagem enviarmensagem(@RequestBody Mensagem mensagem) {
            return mensagem;
        }
    }

