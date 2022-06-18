package entidades;

public class ContaJuridica extends ContaFisica{
	private Double limiteEmprestimo;
    
	
	public ContaJuridica(Integer numero, String correntista, Double saldo, Double limiteEmprestimo) {
		super(numero, correntista, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	} 
	
	
	
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}



	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	@Override
	public void saque(Double valor) {
		if(saldo >= (valor+2.00)) {
			super.saque(100.00);
			saldo -= 2.00;
		}
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}
    
	public void emprestimo(Double valor) {
		if(limiteEmprestimo >= (valor)) {
			deposito(valor);
		}
	}

}
