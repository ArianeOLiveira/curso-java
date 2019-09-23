package br.com.codenation.aulas.primeira.desafios;

public class Atribuicao {
	
	public byte primeiro(byte a, byte b) {
		//System.out.println(b);
		b = 5;
		//System.out.println(a + "," + b);
		segundo(a, b);
		return b;
	}
	
	private int segundo(byte a, byte b) {
		int c = (a + b);
		System.out.println(c);
		b = 10;
		System.out.println(b + "," + c);
		c = (byte) (a + b);
		System.out.println(a + "," + b + "," + c);
		return c;
	}
	
	public void terceiro(int a) {
		int b = a + 1;
		a = b + 1;
		b = a + 1;
		System.out.println(a);
		a = b + 1;
		System.out.println(a + "," + b);
	}

}
