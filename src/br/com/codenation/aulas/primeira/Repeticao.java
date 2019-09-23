package br.com.codenation.aulas.primeira;

public class Repeticao {
	
	public void repetirInformacao(int quantidade) {
				
		for (int i = 0; i < quantidade; i++) {
			System.out.println("for - " + i);
		}
		
		int i = 0;
		while (i < 10) {
		    System.out.println("while - " + i);
		    i++;
		}
		
		int a = 0;
		do{
			System.out.println("do while - " + a);
			++a;
		} while(a < 10 );
		
		
	}
	
	
	
}
