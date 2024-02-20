package br.com.estevao.controlefinanceiro.servico;

import br.com.estevao.controlefinanceiro.excecao.CategoriaInvalidaException;
import br.com.estevao.controlefinanceiro.modelo.Despesa;
import br.com.estevao.controlefinanceiro.modelo.Receita;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LancamentoServico {
    private List<Despesa> despesas;
    private List<Receita> receitas;

    public LancamentoServico() {
        this.despesas = new ArrayList<>();
        this.receitas = new ArrayList<>();
    }

    public void registrarDespesa(Despesa despesa) {
        despesas.add(despesa);
    }

    public void registrarReceita(Receita receita) {
        receitas.add(receita);
    }

    public double calcularSaldo() {
        double saldoDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
        double saldoReceitas = receitas.stream().mapToDouble(Receita::getValor).sum();
        return saldoReceitas - saldoDespesas;
    }

    // Métodos getters para acessar as listas de despesas e receitas

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }


}
