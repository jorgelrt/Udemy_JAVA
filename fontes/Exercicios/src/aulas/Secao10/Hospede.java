package aulas.Secao10;

public class Hospede {
	private String nome;
	private String email;
	//private int quarto;
	
	//construtor
	public Hospede(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	//Getters and Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
}
