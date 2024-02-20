package br.com.estevao.controlefinanceiro.excecao;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar a transação.");
    }

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
