package br.com.estevao.controlefinanceiro.modelo;

import java.time.LocalDate;

public class Despesa {
    private String nome;
    private double valor;
    private Categoria categoria;
    private LocalDate data;

    public Despesa(String nome, double valor, Categoria categoria, LocalDate data) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
    }

    // Getters e setters (métodos de acesso) para os atributos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Despesa{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", categoria=" + categoria +
                ", data=" + data +
                '}';
    }
}