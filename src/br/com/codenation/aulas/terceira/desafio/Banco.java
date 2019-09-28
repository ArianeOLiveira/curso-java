package br.com.codenation.aulas.terceira.desafio;

import java.util.ArrayList;

public class Banco {

	public ArrayList<ContaBancaria> contas = new ArrayList<>();

	public void inserir(ContaBancaria conta) {
		contas.add(conta);
	}

	public void remover(ContaBancaria conta) {
		contas.remove(conta);
	}

	public ContaBancaria procurarConta(String conta) {
		for (ContaBancaria c : contas) {
			if (c.conta.equals(conta)) return c;
		}
		return null;
	}
	
}
