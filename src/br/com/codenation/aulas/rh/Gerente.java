package br.com.codenation.aulas.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.validacoes.ValidacaoFuncionario;

public class Gerente extends Funcionario implements Autenticavel {
	
	private String celularComercial;
	
	public Gerente(String nome, Date nascimento, String cpf, Login login, Double salario) throws ValidacaoFuncionario {
		super(nome, nascimento, cpf, login, salario);
	}
	
	public String getCelularComercial() {
		return celularComercial;
	}

	public void setCelularComercial(String celularComercial) {
		this.celularComercial = celularComercial;
	}

	@Override
	public String Autenticar(Login login) {
		return "Gerente autenticado";
	}
	
	@Override
	public void getBonificacao() {
		System.out.println("Implementação de método abstrato");
	}
	
}