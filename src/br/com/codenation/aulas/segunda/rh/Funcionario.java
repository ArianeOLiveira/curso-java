package br.com.codenation.aulas.segunda.rh;

import java.util.Date;

import br.com.codenation.aulas.segunda.rh.validacoes.ValidacaoFuncionario;

public class Funcionario {
	
	private String nome;
	private Date nascimento;
	private String cpf;
	private Login login;
	private Double salario;
	
	public Funcionario(String nome, Date nascimento, String cpf, Login login, Double salario) throws ValidacaoFuncionario {
		setNome(nome);
		setNascimento(nascimento);
		setCpf(cpf);
		setLogin(login);
		setSalario(salario);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) throws ValidacaoFuncionario {
		try {
			if (cpf.length() == 11 ) {
				this.cpf = cpf;
			} else {
				throw new ValidacaoFuncionario("O CPF deve conter 11 caracteres.");
			}
		} catch (NullPointerException e) {
			throw new ValidacaoFuncionario("O CPF não foi preenchido.");
		}
	}
	
	public Login getLogin() {
		return login;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
	public String retornaFuncionario() {
		return this.nome + ", " + this.nascimento;
	}
}
