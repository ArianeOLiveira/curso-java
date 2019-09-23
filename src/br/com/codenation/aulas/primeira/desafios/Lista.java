package br.com.codenation.aulas.primeira.desafios;

import java.util.ArrayList;

public class Lista {

	public void primeiro() {

		String[] lista = new String[10];
		lista[0] = "Ariane";
		lista[1] = "Bruna";
		lista[2] = "Carol";
		lista[3] = "Dani";
		lista[4] = "Elaine";
		lista[5] = "Fabiana";
		lista[6] = "Gabi";
		lista[7] = "Helena";
		lista[8] = "Ingrid";
		lista[9] = "Jaqueline";
				
		if (contem(lista, "Ariane")) {
			System.out.println("ACHEI");
		} else {
			System.out.println("NÃO ACHEI");
		}

	}

	public boolean contem(String[] lista, String nome) {
		for (int i = 0; i < lista.length; i++) {
			if (nome == lista[i]) {
				return true;
			}
		}
		return false;
	}

	public void segundo() {

		ArrayList<String> lista = new ArrayList<>();
		lista.add("Ariane");
		lista.add("Bruna");
		lista.add("Carol");
		lista.add("Dani");
		lista.add("Elaine");
		lista.add("Fabiana");
		lista.add("Gabi");
		lista.add("Helena");
		lista.add("Ingrid");
		lista.add("Jaqueline");
				
		if (lista.contains("Gabi")) {
			System.out.println("ACHEI");
		} else {
			System.out.println("NÃO ACHEI");
		}
	}
}
