package br.com.codenation.aulas.primeira;

import java.util.ArrayList;

public class Lista {

	public void manipulandoCliente() {

		/* Escreva um algoritmo que permita a leitura dos nomes de
		 *  10 pessoas e armazene os nomes lidos em um vetor. 
		 *  Após isto, o algoritmo deve permitir a leitura de mais 1
		 *   nome qualquer de pessoa e depois escrever a mensagem ACHEI, 
		 *   se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor),
		 *    ou NÃO ACHEI caso contrário.
		 */

		ArrayList<Cliente> vetor = new ArrayList<>();

		Cliente cliente1 = new Cliente("Nome da criança", "Av. Paulista, 575", 8);
		Cliente cliente2 = new Cliente("Nome da mãe", "Av. Paulista, 575", "", 43);
		Cliente cliente3 = new Cliente("Nome da mãe", "Av. Paulista, 575", "", 43);

		vetor.add(cliente1);
		vetor.add(cliente2);
		vetor.add(0, cliente3);

		//int tamanho = vetor.size();

		if (vetor.contains(cliente1)) {
			System.out.println("Cliente encontrado");
		}

		vetor.remove(cliente1);
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		for (Cliente c : vetor) {
			System.out.println("Cliente - " + c.nome);
		}
		
		vetor.forEach(c -> System.out.println(c.nome));
	}
}
