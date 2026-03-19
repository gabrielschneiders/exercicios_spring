package br.com.exercicios.spring.exemplo01.service;

import org.springframework.stereotype.Service;

    @Service
    public class Exercicio02Service {

        public int converterRomanoParaDecimal(String romano) {
            int resultado = 0;
            int valorAnterior = 0;

            romano = romano.toUpperCase();

            for (int i = romano.length() - 1; i >= 0; i--) {
                int valorAtual = valorRomano(romano.charAt(i));

                if (valorAtual < valorAnterior) {
                    resultado -= valorAtual;
                } else {
                    resultado += valorAtual;
                }

                valorAnterior = valorAtual;
            }

            return resultado;
        }

        private int valorRomano(char c) {
            switch (c) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: throw new IllegalArgumentException("Número romano inválido");
            }
        }
    }





