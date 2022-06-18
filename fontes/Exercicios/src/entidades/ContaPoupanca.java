package entidades;

public class ContaPoupanca extends ContaFisica {
	private Double taxaJuros;

	public ContaPoupanca(Integer numero, String correntista, Double saldo, Double taxaJuros) {
		super(numero, correntista, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public void saque(Double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}
	
	public void aplicarRenda() {
		saldo += saldo * taxaJuros;
	}
	
}
