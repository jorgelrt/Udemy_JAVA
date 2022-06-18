package entidades;

public class ContaBancaria {
	private static final double TAXA = 5.00;
	private int numeroConta;
	private String titular;
	private double saldo;
	//Contrutor
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(saldo);
	}
	
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	//Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getsaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		if(getsaldo() > valor+TAXA) {
			this.saldo -= valor + TAXA;
		}else {
			System.out.println("Saldo insuficiente para saque");
		}
		
	}
	
	public String toString() {
		return numeroConta
				+ " - "
				+titular
				+" - saldo R$: "
				+saldo;
	}
}
