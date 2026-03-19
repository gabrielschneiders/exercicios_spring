package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class Exercicio07Controller {

        @Autowired
        private Exercicio07Service exercicio07Service;

        @GetMapping("/primo/{numero}")
        public ResponseEntity<?> verificarPrimo(@PathVariable int numero) {

            boolean resultado = exercicio07Service.ehPrimo(numero);

            return ResponseEntity.ok(
                    Map.of(
                            "numero", numero,
                            "ehPrimo", resultado
                    )
            );
        }
    }

