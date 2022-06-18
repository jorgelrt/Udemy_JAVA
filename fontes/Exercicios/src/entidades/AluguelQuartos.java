package entidades;

public class AluguelQuartos {
	private String nome;
	private String email;
	
	//Construtor
	public AluguelQuartos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//Outros
	public String toString() {
		return  nome
				+" | "
				+ email ;
				
	}
	
	
}
