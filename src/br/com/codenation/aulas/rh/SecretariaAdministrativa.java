package br.com.codenation.aulas.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.validacoes.ValidacaoFuncionario;

public class SecretariaAdministrativa extends Secretaria {

	public SecretariaAdministrativa(String nome, Date nascimento, String cpf, Login login, Double salario)
			throws ValidacaoFuncionario {
		super(nome, nascimento, cpf, login, salario);
	}

	@Override
	public void getBonificacao() {
		System.out.println("Implementação de método abstrato");
	}

}
