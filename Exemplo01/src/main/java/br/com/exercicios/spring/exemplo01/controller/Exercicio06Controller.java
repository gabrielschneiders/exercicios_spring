package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio06Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
    @RequestMapping
public class Exercicio06Controller {
    @Autowired
    public Exercicio06Service exercicio06Service;

    @GetMapping("/media")
    public ResponseEntity<?> calcularMedia(@RequestParam String notas) {

        try {
            Exercicio06Controller exercicio06Controller;

            double media = exercicio06Service.calcularMedia(notas);
            return ResponseEntity.ok(Map.of("media", media));

        } catch (IllegalArgumentException e) {
            return ResponseEntity
                    .badRequest()
                    .body(Map.of("erro", e.getMessage()));


        }
    }
}


