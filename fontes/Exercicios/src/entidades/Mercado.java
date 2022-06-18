package entidades;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	private Integer id;
	private String nome;
	private List<Produtos> ListaProdutos = new ArrayList<Produtos>();
	
	public Mercado(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Mercado() {
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Produtos> getListaProdutos(){
		return ListaProdutos;
	}
	
	public void addProdutos(Produtos ItemLista) {
		ListaProdutos.add(ItemLista);
	}
	
	public void remProdutos(Produtos ItemLista) {
		ListaProdutos.remove(ItemLista);
	}
	
	
	
	
}
