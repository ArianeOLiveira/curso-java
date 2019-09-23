package br.com.codenation.aulas.primeira;

import java.util.Arrays;

public class Array {

	private Cliente[] clientes = new Cliente[2];

	public void adiciona(Cliente cliente) {
		for (int i = 0; i < this.clientes.length; i++) {
			if (this.clientes[i] == null) {
				this.clientes[i] = cliente;
				break;
			}
		}
	}

	public Cliente pega(int posicao) {
		 return this.clientes[posicao];
	}

	public void remove(int posicao) {
		this.clientes[posicao] = null;
	}

	public boolean contem(Cliente cliente) {
		for (int i = 0; i < this.clientes.length; i++) {
			if (cliente == this.clientes[i]) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.clientes.length;
	}

	public String toString() {
		return Arrays.toString(clientes);
	}

}
