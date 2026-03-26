package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Equipamento;
import br.com.exercicios.spring.exemplo01.entity.Registro;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("api/exercicioPost06")
public class ExercicioPost06 {


        @PostMapping("registro")
        public Registro cadastrarEquipamento(@RequestBody Registro registro) {
            return registro;
        }
    }


