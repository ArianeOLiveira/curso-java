package br.com.codenation.aulas.primeira.desafios;

public class Condicionais {

	public void primeiro(int valor) {
		if (valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
	}

	public void segundo(int quantidade) {
		if (quantidade >= 12) {
			System.out.println("Valor total da compra: " + (quantidade * 1));
		} else {
			System.out.println("Valor total da compra: " + (quantidade * 1.30));
		}
	}

}
