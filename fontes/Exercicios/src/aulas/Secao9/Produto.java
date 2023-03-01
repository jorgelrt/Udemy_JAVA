package aulas.Secao9;

public class Produto {
	private String nome;
	private double preco;
	private int qtde;
	
	//construtor padrao
	public Produto() {
		
	}
	
	//construtor
	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	//sobrecarga
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public double valorTotal() {
		if (qtde == 0) {
			return preco;
		}else {
			return preco * qtde;
		}
		
	}
	//A quantidade só pode mudar através dos métodos abaixo
	public void addItem(int qtde) {
		this.qtde += qtde;
	}
	
	public void remItem(int qtde) {
		this.qtde -= qtde;
	}
	
	public String toString() {
		return 	nome
				+", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ qtde
				+ " unidades, Total: $ "
				+String.format("%.2f", valorTotal());
	}

}
