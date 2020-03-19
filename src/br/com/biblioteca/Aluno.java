package br.com.biblioteca;



public class Aluno extends Usuario {
	private String ra;
	private String curso;
	
	



	

	public Aluno(String ra,String curso, String nome, String endereco, String cpf, String dataNascimento) {
		super(nome, endereco, cpf, dataNascimento);
		this.curso=curso;
		this.ra=ra;
		
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", curso=" + curso + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
				+ ", getCpf()=" + getCpf() + ", getDataNascimento()=" + getDataNascimento() + ", consultarObra()="
				+ consultarObra() + ", toString()=" + super.toString() + "]";
	}

	

	
	
	

}
