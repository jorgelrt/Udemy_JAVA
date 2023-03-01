package aulas.Secao10;

import entidades.Produtos;

public class Produto {
	private String descricao;
	private double preco;
	
	//Construtor
	public Produto(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	
	//Setters and Getters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String novaDescricao) {
		this.descricao = novaDescricao;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double Preco) {
		this.preco = preco;
	}
	
	//Outros métodos
	
	
}
