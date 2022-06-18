package entidades;

public class Funcionario {
	private Integer codigo;
	private String nome;
	private Double salarioBruto;
	private Double taxa;
	//Construtores
	public Funcionario(Integer codigo, String nome, Double salarioBruto, Double taxa) {
		this.codigo = codigo;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.taxa = taxa;
	}
	public Funcionario(Integer codigo, String nome, Double salarioBruto) {
		this.codigo = codigo;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	//Getters and Setters
	public Integer getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioBruto() {
		return salarioBruto;
	}
	
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double calcSal() {
		if(taxa == null) {
		return salarioBruto;
		}else {
		return salarioBruto-(salarioBruto * taxa);
		}
	}
	
	public void aumentaSal(Double perc) {
		salarioBruto = salarioBruto * perc;
	}
	
	public String toString() {
		return 	"codigo: "
				+codigo
				+" - Nome: "
				+nome
				+"  R$ "
				+ String.format("%.2f", calcSal());
	}
	
}
