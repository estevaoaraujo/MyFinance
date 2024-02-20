package br.com.estevao.controlefinanceiro.excecao;

import br.com.estevao.controlefinanceiro.servico.LancamentoServico;

public class CategoriaInvalidaException extends Exception {
    public CategoriaInvalidaException() {
        super("Categoria inválida para a transação.");
    }

    public CategoriaInvalidaException(String mensagem) {
        super(mensagem);
    }

}
