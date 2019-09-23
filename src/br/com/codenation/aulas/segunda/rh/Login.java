package br.com.codenation.aulas.segunda.rh;

import br.com.codenation.aulas.segunda.rh.validacoes.ValidacaoFuncionario;

public class Login {

	private String usuario;
	private String senha;

	public Login(String usuario, String senha) throws ValidacaoFuncionario {
		setUsuario(usuario);
		setSenha(senha);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws ValidacaoFuncionario {
		try {
			if (senha.length() >= 8 && senha.length() <= 10) {
				this.senha = senha;
			} else {
				throw new ValidacaoFuncionario("A senha deve conter entre 8 e 10 caracteres.");
			}
		} catch (NullPointerException e) {
			throw new ValidacaoFuncionario("A senha não foi preenchida.");
		}

	}

}
