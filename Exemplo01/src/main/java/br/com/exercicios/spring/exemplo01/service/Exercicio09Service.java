package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio09Service {
    public double calcularArea(double base, double altura) {

        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero");
        }

        return (base * altura) / 2;
    }
}

