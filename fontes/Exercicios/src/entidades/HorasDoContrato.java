package entidades;

import java.util.Date;

public class HorasDoContrato {
	private Date data;
	private Double valorHora;
	private Integer totalHorasContratadas;
	
	public HorasDoContrato(Date data, Double valorHora, Integer totalHorasContratadas) {
		this.data = data;
		this.valorHora = valorHora;
		this.totalHorasContratadas = totalHorasContratadas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getTotalHorasContratadas() {
		return totalHorasContratadas;
	}

	public void setTotalHorasContratadas(Integer totalHorasContratadas) {
		this.totalHorasContratadas = totalHorasContratadas;
	}
	
	public Double valorTotal() {
		return valorHora * totalHorasContratadas;
	}
}
