package br.com.codenation.aulas.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.validacoes.ValidacaoFuncionario;

abstract class Secretaria extends Funcionario {
	
	public Secretaria(String nome, Date nascimento, String cpf, Login login, Double salario) throws ValidacaoFuncionario {
		super(nome, nascimento, cpf, login, salario);
	}
	
}
