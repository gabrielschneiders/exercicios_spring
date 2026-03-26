package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Equipamento;
import br.com.exercicios.spring.exemplo01.entity.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("api/exemplo05")
public class ExercicioPost05 {


        @PostMapping("equipamento")
        public Equipamento cadastrarEquipamento(@RequestBody Equipamento equipamento) {
            return equipamento;
        }
    }


