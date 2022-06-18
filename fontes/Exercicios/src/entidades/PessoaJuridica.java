package entidades;

public class PessoaJuridica extends Pessoa {
	private Integer nrFunc;
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer nrFunc) {
		super(nome, rendaAnual);
		this.nrFunc = nrFunc;
	}

	public Integer getNrFunc() {
		return nrFunc;
	}
	
	public void setNrFunc(Integer nrFunc) {
		this.nrFunc = nrFunc;
	}
	
	public Double calcImposto() {
		if(nrFunc > 10) {
			return ((getRendaAnual() * 1.14) - getRendaAnual());
		}else {
			return ((getRendaAnual() * 1.16) - getRendaAnual());
		}
	}
	
	
	
}
