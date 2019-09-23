package br.com.codenation.aulas.primeira;

public class Condicional {
	
	public void retornaDia(int dia) {
		switch (dia) {
		  case 1 :
		    System.out.println("Hoje � segunda-feira");
		    break;
		  case 2:
		    System.out.println("Hoje � ter�a-feira");
		    break;
		  case 3:
		    System.out.println("Hoje � quarta-feira");
		    break;
		  case 4:
		    System.out.println("Hoje � quinta-feira");
		    break;
		  case 5:
		    System.out.println("Hoje � sexta-feira");
		    break;
		  case 6:
		    System.out.println("Hoje � s�bado");
		    break;
		  case 7:
		    System.out.println("Hoje � domingo");
		    break;
		}
	}
	
	public void retornaFaixaEtaria(int idade) {
		if (idade <= 12) {
			System.out.println("De 0 a 12 anos");
		} else if (idade > 12 && idade <= 18) {
			System.out.println("De 13 a 18 anos");
		} else {
			System.out.println("Maior de 18 anos");
		}
	}
	
	public String retornaTernario(int idade) {
		return (idade >= 18) ? "Maior de idade" : "Menor de idade"; 
	}

}
