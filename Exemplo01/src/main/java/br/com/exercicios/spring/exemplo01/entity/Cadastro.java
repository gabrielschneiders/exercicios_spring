package br.com.exercicios.spring.exemplo01.entity;

public class Cadastro {
    private String nome;
    private double data;
    private String local;

    public Cadastro() {
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public double getData() {
        return data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(double data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}

