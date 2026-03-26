package br.com.exercicios.spring.exemplo01.controller;

import br.com.exercicios.spring.exemplo01.entity.Alunos;
import br.com.exercicios.spring.exemplo01.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/exercicioPost01")
public class ExercicoPost01 {

    @PostMapping("aluno")
    public Alunos cadastrarAluno(@RequestBody Alunos aluno) {
        return aluno;

    }
}
