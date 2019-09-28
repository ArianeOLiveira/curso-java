package br.com.codenation.aulas.terceira.desafio;

public class Executavel {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaCorrente.saldo = 125.80;
		contaPoupanca.saldo = 150.50;
		
		contaCorrente.sacar(120.20);
		contaPoupanca.sacar(200.50);
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorio(contaCorrente);
		relatorio.gerarRelatorio(contaPoupanca);
		
		
		
	}
}
