package br.com.codenation.aulas.primeira;

import br.com.codenation.aulas.util.ValidaCPF;

public class Cliente {

	public String nome;
	private String endereco;
	private String cpf;
	public int idade;
	private final int id = 180;

	public Cliente(String nome, String endereco, String cpf, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}

	public Cliente(String nome, String endereco, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
	}

	protected void mudaCPF(String cpf) {
		if (validaCPF()) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF Inválido");
		}
	}

	public boolean validaCPF() {
		return ValidaCPF.isCPF(this.cpf);
	}

	public void alteraEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String retornaCliente() {
		return "Cliente " + id + ", " + nome;
	}

	public String consultaCpf() {
		return cpf;
	}
}
