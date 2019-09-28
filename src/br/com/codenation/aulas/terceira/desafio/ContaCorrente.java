package br.com.codenation.aulas.terceira.desafio;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

	private Double taxaDeOpera��o = 4.50;

	@Override
	public void sacar(Double valor) {
		if ((saldo - valor) > 0) {
			saldo = saldo - valor - taxaDeOpera��o;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	@Override
	public void depositar(Double valor) {
		saldo = saldo + valor - taxaDeOpera��o;
	}

	@Override
	public void mostrarDados() {
		System.out.println("Conta: " + conta);
		System.out.println("Saldo: " + saldo);
		System.out.println("Taxa de Opera��o: " + taxaDeOpera��o);
	}

}
