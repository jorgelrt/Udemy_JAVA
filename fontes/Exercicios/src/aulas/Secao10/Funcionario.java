package aulas.Secao10;

import java.util.List;

import utilitarios.funcListaFuncionario;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	//Construtor
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	//Getters and Setters
	public void setID(Integer id) {
		this.id = id;
	}
	public Integer getID() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return	id
				+" - "
				+ nome
				+" R$ "
				+String.format("%.2f", salario);
	}
	//Outros Metodos
	
	public void AumentoSalarial(Double percentual) {
		salario += salario * percentual / 100;
	}
	
	
	
	
}
