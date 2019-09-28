package br.com.codenation.aulas.terceira.interfaces;

public class Soma implements OperacaoMatematica {

	@Override
	public int calcula(int a, int b) {
		return a + b;
	}

}
