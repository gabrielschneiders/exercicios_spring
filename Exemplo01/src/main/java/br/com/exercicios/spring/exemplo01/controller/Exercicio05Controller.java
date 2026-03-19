package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping
public class Exercicio05Controller {
        @Autowired
        Exercicio05Service exercicio05Service;
        @GetMapping("/celsius-para-fahrenheit")
        public double converterTemperatura(@RequestParam double celsius) {
            return (celsius * 9/5) + 32;
        }
    }

