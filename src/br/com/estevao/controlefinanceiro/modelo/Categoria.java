package br.com.estevao.controlefinanceiro.modelo;

public class Categoria {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters (métodos de acesso) para o atributo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
