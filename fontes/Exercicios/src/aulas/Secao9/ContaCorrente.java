package aulas.Secao9;

public class ContaCorrente {
	private int NrConta;
	private String NmTitular;
	private double Saldo;
	
	public final double TAXA = 5.00;
	
	//Construtores
	public ContaCorrente(int NrConta, String NmTitular, double DepInicial) {
		this.NrConta = NrConta;
		this.NmTitular = NmTitular;
		deposito(DepInicial);
	}
	
	public ContaCorrente(int NrConta, String NmTitular) {
		this.NrConta = NrConta;
		this.NmTitular = NmTitular;
	}
	//Getters and Setters
	public void setNmTitular(String novoNome) {
		NmTitular = novoNome;
	}
	
	public String getNmTitular() {
		return NmTitular;
	}
	
	public double getSaldo() {
		return Saldo;
	}
	//Outros Métodos
	public void deposito(double valor) {
		Saldo += valor;
	}
	
	public void saque(double valor) {
		Saldo -= (valor + TAXA);
	}
	
	public String toString() {
		return 	NrConta
				+ " : "
				+NmTitular
				+" - R$ "
				+String.format("%.2f", getSaldo());
	}
}
