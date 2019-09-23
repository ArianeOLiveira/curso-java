package br.com.codenation.aulas.segunda.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.rh.validacoes.ValidacaoFuncionario;

public class Diretor extends Funcionario {
	
	private String celularComercial;
	private String carro;
	
	public Diretor(String nome, Date nascimento, String cpf, Login login, Double salario) throws ValidacaoFuncionario{
		super(nome, nascimento, cpf, login, salario);
	}
	
	@Override
	public String retornaFuncionario() {
		return "Não é possível obter informações de um diretor";
	}

	public String getCelularComercial() {
		return celularComercial;
	}

	public void setCelularComercial(String celularComercial) {
		this.celularComercial = celularComercial;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}
	
}
