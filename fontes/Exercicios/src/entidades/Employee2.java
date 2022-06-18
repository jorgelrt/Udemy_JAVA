package entidades;

public class Employee2 {
	private String nome;
	private Double salarioBruto;
	private Double IR;
	
	//Construtor
	public Employee2(String nome, Double salario, Double taxa) {
		this.nome = nome;
		this.salarioBruto = salario;
		this.IR = taxa;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return salarioBruto;
	}

	
	public Double getTaxa() {
		return IR;
	}
	
	public void setTaxa(Double taxa) {
		this.IR = taxa;
	}
	
	//outros metodos
	public void aumentoSalarial(double percentual) {
		this.salarioBruto += ((salarioBruto*percentual)/100);
	}
	
	public double salarioLiquido() {
		return salarioBruto - IR;
	}
	
	@Override
	public String toString() {
		return  nome
				+", $"
				+String.format("%.2f", salarioLiquido());
	}
	
}

