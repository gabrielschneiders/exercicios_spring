package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;
@Service



public class Exercicio07Service {

        public boolean ehPrimo(int numero) {

            if (numero <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


