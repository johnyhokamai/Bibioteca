package br.com.biblioteca;

import java.util.Date;



public class Funcionario extends Usuario {
	private Date dataAdmissao;
	private String departamento;
	
	
	

	public Funcionario(String nome, String endereco, String cpf, String dataNascimento) {
		super(nome, endereco, cpf, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
