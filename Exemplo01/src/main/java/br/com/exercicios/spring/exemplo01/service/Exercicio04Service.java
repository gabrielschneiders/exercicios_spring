package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;


    @Service
public class Exercicio04Service {






            public boolean ehPalindromo(String palavra) {
                palavra = palavra.toLowerCase();

                int inicio = 0;
                int fim = palavra.length() - 1;

                while (inicio < fim) {
                    if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                        return false;
                    }
                    inicio++;
                    fim--;
                }

                return true;
            }
        }

