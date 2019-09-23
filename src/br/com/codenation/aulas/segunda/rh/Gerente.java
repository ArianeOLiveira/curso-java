package br.com.codenation.aulas.segunda.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.rh.validacoes.ValidacaoFuncionario;

public class Gerente extends Funcionario {
	
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
	
}