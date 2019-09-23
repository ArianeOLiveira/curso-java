package br.com.codenation.aulas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.codenation.aulas.segunda.rh.Funcionario;
import br.com.codenation.aulas.segunda.rh.Login;
import br.com.codenation.aulas.segunda.rh.Secretario;
import br.com.codenation.aulas.segunda.rh.validacoes.ValidacaoFuncionario;

public class Main {

	public static void main(String[] args) {
		
		try {

			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, 1994);
			c.set(Calendar.MONTH, Calendar.OCTOBER);
			c.set(Calendar.DAY_OF_MONTH, 15);

			Date nascimento = c.getTime();

			Login login = new Login("ariane.almeida", "abcdefghi");
			Funcionario secretario = new Secretario("Ariane Oliveira", nascimento, "15153159874", login, 1.500);

			List<Integer> teste = new ArrayList<>();
			
			
			
			System.out.print(secretario.retornaFuncionario());

		} catch (ValidacaoFuncionario | NullPointerException e) {
			System.out.print(e.getMessage());
		}

	}

}
