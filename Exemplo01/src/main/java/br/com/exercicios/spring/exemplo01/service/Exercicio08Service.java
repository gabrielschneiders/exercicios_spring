package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio08Service {
    public int converterHorasParaMinutos(int horas) {

        if (horas < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas");
        }

        return horas * 60;
    }
}

