package entidades;

public class ContaFisica {
	private Integer numero;
	private String correntista;
	protected Double saldo;
	
	private static Double TAXA = 5.00;
	
	public ContaFisica(Integer numero, String correntista, Double saldo) {
		this.numero = numero;
		this.correntista = correntista;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public Double getSaldo() {
		return saldo;
	}

	
	public void saque(Double valor) {
		if(saldo >= (valor+TAXA)) {
			saldo -= (valor+TAXA);
		}
	}
	
	public void deposito(Double valor) {
		saldo += valor;
	}
	
}
