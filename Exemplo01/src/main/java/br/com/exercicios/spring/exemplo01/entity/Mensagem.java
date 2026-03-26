package br.com.exercicios.spring.exemplo01.entity;

public class Mensagem {
    private String remetente;
    private String destinario;
    private String conteudo;


    public Mensagem() {
    }

    public String getRemetente() {
        return remetente;
    }

    public String getDestinario() {
        return destinario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public void setDestinario(String destinario) {
        this.destinario = destinario;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
