package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Nivel;

public class Trabalhador {
	private String nome;
	private Nivel nivel;//associação – Departamento 1 para 1
	private Double baseSal;
	
	private Departamento departamento;//associação com a classe Departamento
	/*associação – HorasDoContrato 1 para muitos. 
	 * Qdo tivermos uma composição “um-para-muitos” ou seja um atributo lista, 
	 * iremos deixá-la de fora ao construir os contrutores e ao invés disso, instânciamos a lista na própria declaração do atributo da classe
	 */
	private List<HorasDoContrato> listaHorasContrato = new ArrayList<HorasDoContrato>();
	
	//Construtor
	public Trabalhador(String nome, Nivel nivel, Double baseSal, Departamento nmDepto) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSal = baseSal;
		this.departamento = nmDepto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(Double baseSal) {
		this.baseSal = baseSal;
	}

	public Departamento getNmDepto() {
		return departamento;
	}

	public void setNmDepto(Departamento nmDepto) {
		this.departamento = nmDepto;
	}
	
	public List<HorasDoContrato> getListaContratos(){
		return listaHorasContrato;
	}
	//método irá adicionar um contrato no atributo do tipo lista da classe
	public void addContrato(HorasDoContrato contrato) {
		listaHorasContrato.add(contrato);
	}
	
	public void removeContrato(HorasDoContrato contrato) {
		listaHorasContrato.remove(contrato);
	}
	/*A lógica é iniciar somando o salárioBase do trabalhador e ao informar um mês/ano 	
	 * percorrer a lista, e ao encontrar, adicinar os valores do contrato ao salárioBase
	 */
	public Double calcularContrato(Integer ano, Integer mes) {
		Double soma = baseSal;
		//instanciando objeto Calendar
		Calendar cal = Calendar.getInstance();
		
		for(HorasDoContrato hc : listaHorasContrato) {
			/*vou precisar de um objeto do tipo Calendar, para manipular a data.
			*Setar para o objeto instânciado a data do 1º contrato trazido pelo for each
			*utilizando a função getData do objeto HorasContrato
			*/
			cal.setTime(hc.getData());
			//obtenho o mês da data setada vigente do for each
			Integer c_ano = cal.get(Calendar.YEAR);
			Integer c_mes = cal.get(Calendar.MONTH) + 1;
			if(c_ano.equals(ano)  && c_mes.equals(mes)) {
				soma += hc.valorTotal();
			}
		}
		return soma;
	}
}
