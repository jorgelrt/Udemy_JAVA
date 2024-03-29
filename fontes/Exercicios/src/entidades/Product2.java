package entidades;

import exceptions.QtdeLimiteException;

public class Product2 {
	private String nome;
	private Double preco;
	private Integer qtde;
	//Construtor
	public Product2(String nome, Double preco, Integer qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Integer getQtde() {
		return qtde;
	}
	
	//outros m�todos
	public Double totalValueStock() {
		return (double)qtde * preco;
	}
	
	public void addProducts(int qtde) {
		this.qtde += qtde;
	}
	
	public void removeProducts(int qtde) throws QtdeLimiteException {
		if(this.qtde - qtde < 0){
			//lan�o uma exception que se propagar� na pr�xima classe
			throw new QtdeLimiteException("Valor solicitado p retirada excede o limite em estoque!");  
		}else {
			this.qtde -= qtde;
		}
		
	}
	
	public String toString() {
		return "Dados do Produto: "
				+nome
				+" , $ "
				+String.format("%.2f", preco)
				+" ,"
				+qtde
				+" unidades, Total: $"
				+String.format("%.2f", totalValueStock());
	}
}
