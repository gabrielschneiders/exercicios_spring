package br.com.exercicios.spring.exemplo01.entity;

import java.time.LocalDate;

public class Registro {
    private String usuario;
    private String itemEmprestado;
    private LocalDate data;

    public Registro() {
    }

    public String getUsuario() {
        return usuario;
    }

    public String getItemEmprestado() {
        return itemEmprestado;
    }

    public LocalDate getData() {
        return data;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setItemEmprestado(String itemEmprestado) {
        this.itemEmprestado = itemEmprestado;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
