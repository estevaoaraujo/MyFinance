package br.com.estevao.controlefinanceiro.aplicacao;


import br.com.estevao.controlefinanceiro.modelo.Categoria;
import br.com.estevao.controlefinanceiro.modelo.Receita;
import br.com.estevao.controlefinanceiro.servico.LancamentoServico;

import java.time.LocalDate;

public class BibliotecaApp {
    public static void main(String[] args) {
        LancamentoServico lancamentoServico = new LancamentoServico();
        Categoria categoria = new Categoria("receitas");
        Receita receita = new Receita("Salario",300,categoria,LocalDate.now());
        lancamentoServico.registrarReceita(receita);
        System.out.println(receita.toString());

    }
}