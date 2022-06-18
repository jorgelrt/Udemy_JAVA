package entidades;

import exceptions.ContaCorrenteException;

public class ContaCorrente {
	private Integer numero;
	private String correntista;
	private Double saldo;
	private Double limiteSaque;
	
	public ContaCorrente(Integer numero, String correntista, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.correntista = correntista;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
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

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double valor) {
		this.saldo += valor;
	}
	
	public void saque(Double valor) throws ContaCorrenteException {
		if(valor > limiteSaque) {
			throw new ContaCorrenteException("Valor solicitado excede o limite!");
		}
		if(valor > saldo) {
			throw new ContaCorrenteException("Nao ha saldo suficiente");
		}
		saldo -= valor;
	}
}
