package br.com.codenation.aulas.terceira.desafio;

public class ContaPoupanca extends ContaBancaria implements Imprimivel {

	private Double limite = -1000.6;

	@Override
	public void sacar(Double valor) {
		if ((saldo - valor) > limite) {
			saldo = saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	@Override
	public void depositar(Double valor) {
		saldo = saldo + valor;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Conta: " + conta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + (limite * (-1)));
	}

}
