package entidades;

public class Cliente {
	private Integer id;
	private String nome;
	private String tel;
	private String endereco;
	
	public Cliente(Integer id, String nome, String tel, String endereco) {
		this.id = id;
		this.nome = nome;
		this.tel = tel;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "ID: "
				+id
				+" nome: "
				+nome
				+" Tel.: "
				+tel
				+" end.: "
				+endereco;				
	}
	
	
}
