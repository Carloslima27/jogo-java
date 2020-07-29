package jogo.entidade.personagens;

public abstract class Personagens {
	private String nome;
	private Bolsa bolsa;
	private Status status;
	
	
	public Personagens(String nome, Bolsa bolsa, Status status) {
		
		this.nome = nome;
		this.bolsa = bolsa;
		this.status = status;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bolsa getBolsa() {
		return bolsa;
	}

	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	
	
	


	
	
	
}
