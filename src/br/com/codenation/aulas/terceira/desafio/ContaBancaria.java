package br.com.codenation.aulas.terceira.desafio;

abstract class ContaBancaria {
	
	public String conta;
	public Double saldo;
	
	public abstract void sacar(Double valor);
	public abstract void depositar(Double valor);
	
	public void transfere(Double valor, ContaBancaria conta) {
		sacar(valor);
		conta.depositar(valor);
	}

}
