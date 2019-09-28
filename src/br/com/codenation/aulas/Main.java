package br.com.codenation.aulas;

import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;

import br.com.codenation.aulas.rh.Gerente;
import br.com.codenation.aulas.rh.Login;
import br.com.codenation.aulas.segunda.validacoes.ValidacaoFuncionario;

public class Main {

	public static void main(String[] args) {
		
		try {

			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, 1994);
			c.set(Calendar.MONTH, Calendar.OCTOBER);
			c.set(Calendar.DAY_OF_MONTH, 15);

			Date nascimento = c.getTime();

			Login login = new Login("ariane.almeida", "abcdefghi");
			Gerente gerente = new Gerente("Ariane Oliveira", nascimento, "15153159874", login, 1.500);

			Class<Gerente> classe = Gerente.class;
			for (Field atributo : classe.getDeclaredFields()) {
			  System.out.println(atributo.getName());      
			}

		} catch (ValidacaoFuncionario | NullPointerException e) {
			System.out.print(e.getMessage());
		}

	}

}
