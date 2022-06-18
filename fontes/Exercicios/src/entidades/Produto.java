package entidades;

public class Produto {
	private int codigo;
	private String nome;
	private Double preco;
	private Integer qtd;
	//Construtor
	public Produto(String nome, Double preco, Integer qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(int codigo, String nome, Double preco, Integer qtd) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(int codigo, String nome, Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
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
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	
	public void saidaEstoque(int saida) {
		this.qtd -= saida;
	}
	
	public void entradaEstoque(int entrada) {
		this.qtd += entrada;
	}
	
	public Double valorTotal() {
		return qtd * preco;
	}
	//sobreposição do método toString do objeto que toda classe é derivada
	public String toString() {
		return 	"Codigo: "
				+ String.format("%d%n", codigo)
				+nome
				+ " R$: "
				+ String.format("%.2f%n", preco)
				+ "Qtd em estoque: "
				+ String.format("%d%n", qtd)
				+ "Total investido: "
				+ String.format("%.2f%n", valorTotal())
				+"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
	}
	
}
