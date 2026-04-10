package br.com.exercicios.spring.copa_2026.Entity;

import br.com.exercicios.spring.copa_2026.Entity.Enum.Status;
import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Entity
public class Copa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String local;
    private Integer ano;
    private Integer quantidadeSelecoes;
    private Integer duracao;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private Status status;


}
