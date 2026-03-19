package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class Exercicio09Controller {
    @Autowired
    private Exercicio09Service exercicio09Service;

    @GetMapping("/triangulo/area")
    public ResponseEntity<?> calcularArea(
            @RequestParam double base,
            @RequestParam double altura) {

        try {
            double area = exercicio09Service.calcularArea(base, altura);

            return ResponseEntity.ok(
                    Map.of(
                            "base", base,
                            "altura", altura,
                            "area", area
                    )
            );

        } catch (IllegalArgumentException e) {
            return ResponseEntity
                    .badRequest()
                    .body(Map.of("erro", e.getMessage()));
        }
    }
}

