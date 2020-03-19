package br.com.biblioteca;

public abstract class Usuario {
	private String nome;
	private String endereco;
	private String cpf;
	private String dataNascimento;
	
	

	public Usuario(String nome, String endereco, String cpf, String dataNascimento) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	// Metodos representados na imagem
	public Obra consultarObra() {
		return new Obra();
	}
	
	public boolean reservarObra(final Obra obra) {
		return true;
	}
	
	public boolean emprestarObra(final Obra obra) {
		return true;
	}
}
