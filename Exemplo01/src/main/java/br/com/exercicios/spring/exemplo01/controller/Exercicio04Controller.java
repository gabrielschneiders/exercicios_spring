package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio04Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Exercicio04Controller {
    @RestController
    @RequestMapping
    public class Exercicio04Cintrolle{
        @Autowired
        Exercicio04Service exercicio04Service;

        @GetMapping("/palindromo")
        public boolean verificarPalindromo(@RequestParam String palavra) {
            return exercicio04Service.ehPalindromo(palavra);
        }

    }
}
