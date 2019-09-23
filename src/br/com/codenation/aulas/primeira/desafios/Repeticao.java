package br.com.codenation.aulas.primeira.desafios;

public class Repeticao {
	
	public void primeiroCrescenteFor() {
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(i);
		}
	}

	public void primeiroCrescenteWhile() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
		    i = i + 1;
		}
	}
	
	public void primeiroDecrescenteFor() {
		for (int i = 10; i >= 1; i = i - 1) {
			System.out.println(i);
		}
	}

	public void primeiroDecrescenteWhile() {
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
		    i = i - 1;
		}
	}
	
	public void segundoFor() {
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println("8 x " + i + " = " + (8 * i));
		}
	}
	
	public void segundoWhile() {
		int i = 1;
		while (i <= 10) {
			System.out.println("8 x " + i + " = " + (8 * i));
		    i = i + 1;
		}
	}
	
}
