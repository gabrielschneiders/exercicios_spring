package br.com.exercicios.spring.exemplo01.entity;

public class Equipamento {
    private String nome;
    private String descricao;
    private int numeroPatrimonio;

    public Equipamento() {
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumeroPatrimonio(int numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
    }
}
