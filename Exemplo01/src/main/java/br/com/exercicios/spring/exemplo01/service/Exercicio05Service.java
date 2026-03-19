package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class Exercicio05Service {


        public double converterTemperatura(@RequestParam double celsius) {
            return (celsius * 9/5) + 32;
        }
    }


