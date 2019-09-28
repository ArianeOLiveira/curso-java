package br.com.codenation.aulas.rh;

public class Cliente implements Autenticavel{

	@Override
	public String Autenticar(Login login) {
		return "Cliente Autenticado";
	}

}
