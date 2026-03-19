package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.service.Exercicio08Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class Exercicio08Controller {
    @Autowired
    private Exercicio08Service exercicio08Service;

    @GetMapping("/converter")
    public ResponseEntity<?> converterHoras(@RequestParam int horas) {

        try {
            int minutos = exercicio08Service.converterHorasParaMinutos(horas);

            return ResponseEntity.ok(
                    Map.of(
                            "horas", horas,
                            "minutos", minutos
                    )
            );

        } catch (IllegalArgumentException e) {
            return ResponseEntity
                    .badRequest()
                    .body(Map.of("erro", e.getMessage()));
        }
    }
}

