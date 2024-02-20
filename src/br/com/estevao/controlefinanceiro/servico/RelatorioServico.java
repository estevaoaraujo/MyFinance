package br.com.estevao.controlefinanceiro.servico;

import br.com.estevao.controlefinanceiro.modelo.Despesa;
import br.com.estevao.controlefinanceiro.modelo.Receita;

import java.util.List;

public class RelatorioServico {

    public void gerarRelatorioMensal(List<Despesa> despesas, List<Receita> receitas) {
        System.out.println("Relatório Mensal:");

        System.out.println("Despesas:");
        for (Despesa despesa : despesas) {
            System.out.println(despesa);
        }

        System.out.println("Receitas:");
        for (Receita receita : receitas) {
            System.out.println(receita);
        }

        double totalDespesas = despesas.stream().mapToDouble(Despesa::getValor).sum();
        double totalReceitas = receitas.stream().mapToDouble(Receita::getValor).sum();
        double saldo = totalReceitas - totalDespesas;

        System.out.println("Total de Despesas: " + totalDespesas);
        System.out.println("Total de Receitas: " + totalReceitas);
        System.out.println("Saldo: " + saldo);
    }
}