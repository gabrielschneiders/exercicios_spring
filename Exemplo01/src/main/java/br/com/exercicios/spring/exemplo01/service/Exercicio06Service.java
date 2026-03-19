package br.com.exercicios.spring.exemplo01.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@Service
public class Exercicio06Service {



        public double calcularMedia(@RequestParam String notas) {


                // Converter string para array de números
                String[] notasArray = notas.split(",");
                double soma = 0;

                for (String n : notasArray) {
                    soma += Double.parseDouble(n);
                }

                double media = soma / notasArray.length;

                return media;
        }
    }

