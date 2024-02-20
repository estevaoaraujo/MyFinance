package br.com.estevao.controlefinanceiro.modelo;


import java.time.LocalDate;

public class Receita {
    private String fonte;
    private double valor;
    private Categoria categoria;
    private LocalDate data;

    public Receita(String fonte, double valor, Categoria categoria, LocalDate data) {
        this.fonte = fonte;
        this.valor = valor;
        this.categoria = categoria;
        this.data = data;
    }

    // Métodos getters e setters (métodos de acesso) para os atributos

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
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
        return "Receita{" +
                "fonte='" + fonte + '\'' +
                ", valor=" + valor +
                ", categoria=" + categoria +
                ", data=" + data +
                '}';
    }
}