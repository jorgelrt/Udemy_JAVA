package entidades;

public class PessoaFisica extends Pessoa{
	private Double despesasMedicas;

	public PessoaFisica(String nome, Double rendaAnual, Double despesasMedicas) {
		super(nome, rendaAnual);
		this.despesasMedicas = despesasMedicas;
	}

	public Double getDepesasMedicas() {
		return despesasMedicas;
	}

	public void setDepesasMedicas(Double depesasMedicas) {
		this.despesasMedicas = depesasMedicas;
	}
	
	public Double calcImposto() {
		if(getRendaAnual() < 20000.00) {
			return ((getRendaAnual() * 1.15) - getRendaAnual() ) - (despesasMedicas/2); 
		}else {
			return ((getRendaAnual() * 1.25) - getRendaAnual() ) - (despesasMedicas/2);
		}
		
	}

	

	
	}
