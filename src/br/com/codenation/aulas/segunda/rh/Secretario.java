package br.com.codenation.aulas.segunda.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.rh.validacoes.ValidacaoFuncionario;

public class Secretario extends Funcionario {
	
	public Secretario(String nome, Date nascimento, String cpf, Login login, Double salario) throws ValidacaoFuncionario {
		super(nome, nascimento, cpf, login, salario);
	}
	
}
