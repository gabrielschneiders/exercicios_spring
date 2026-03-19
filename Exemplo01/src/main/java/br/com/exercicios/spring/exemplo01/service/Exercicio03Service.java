package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;


    @Service
public class Exercicio03Service {


        public long fatorial(int numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("Número não pode ser negativo");
            }

            long resultado = 1;

            for (int i = 1; i <= numero; i++) {
                resultado *= i;
            }

            return resultado;
        }
    }


