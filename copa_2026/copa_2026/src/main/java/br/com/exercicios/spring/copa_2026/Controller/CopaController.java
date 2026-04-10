package br.com.exercicios.spring.copa_2026.Controller;

import br.com.exercicios.spring.copa_2026.Entity.Copa;
import br.com.exercicios.spring.copa_2026.Service.CopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("api/copa")
public class CopaController {
    @Autowired
    CopaService copaService;

    @PostMapping
    public Copa cadastrarCopa(@RequestBody Copa copa) {


        return copaService.salvarCopa(copa);

    }

    @GetMapping
    public List<Copa> buscarTodasAsCopasd() {
        return copaService.listarTodasAsCopas();
    }

    @DeleteMapping
    public String deletarCopa(@RequestParam Long id) {
        return copaService.deletarCopa(id);

    }
    @PutMapping
    public Copa editarCopa(@RequestParam Long id, @RequestParam Copa copaAtualizada){
        return copaService.editarCopa(id, copaAtualizada);
    }

}
