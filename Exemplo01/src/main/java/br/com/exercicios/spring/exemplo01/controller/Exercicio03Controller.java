package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/api/exercicio03")

    public class Exercicio03Controller {
        @Autowired
        Exercicio03Service exercicio03Service;

        @GetMapping("/fatorial/numero")
        public long calcularFatorial(@PathVariable int numero) {
            return exercicio03Service.fatorial(numero);
        }

    }