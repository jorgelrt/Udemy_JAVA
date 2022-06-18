package entidades;

public class Produtos implements Comparable<Produtos> {
	private Integer id;
	private String mercado;
	private String descricao;
	private Double preco;
	
	public Produtos(Integer id, String mercado ,String descricao, Double preco) {
		this.id = id;
		this.mercado = mercado;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getMercado() {
		return mercado;
	}
	
	public void setMeercado(String mercado) {
		this.mercado = mercado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return 	descricao
				+" - R$ "
				+preco
				+" Local: "
				+mercado;
	}

	@Override
	public int compareTo(Produtos outroProduto) {
		if(this.preco > outroProduto.getPreco() ) {
			return 1;
		}else if (this.preco < outroProduto.getPreco()){
			return -1;
		}else {
			return 0;
		}
	}
		
	}

