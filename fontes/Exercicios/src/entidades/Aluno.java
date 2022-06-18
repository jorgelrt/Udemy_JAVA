package entidades;

public class Aluno {
	private int matricula;
	private String nome;
	private double trimestre1;
	private double trimestre2;
	private double trimestre3;
	
	public Aluno(int matricula, String nome, double trimestre1, double trimestre2, double trimestre3) {
		this.matricula = matricula;
		this.nome = nome;
		this.trimestre1 = trimestre1;
		this.trimestre2 = trimestre2;
		this.trimestre3 = trimestre3;
	}
	
	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTrimestre1() {
		return trimestre1;
	}

	public void setTrimestre1(double trimestre1) {
		this.trimestre1 = trimestre1;
	}

	public double getTrimestre2() {
		return trimestre2;
	}

	public void setTrimestre2(double trimestre2) {
		this.trimestre2 = trimestre2;
	}

	public double getTrimestre3() {
		return trimestre3;
	}

	public void setTrimestre3(double trimestre3) {
		this.trimestre3 = trimestre3;
	}
	
	public String toString() {
		return 	"Matricula: "
				+matricula
				+" - "
				+ nome 
				+ ": ["
				+ String.format("%.2f", trimestre1)
				+"] ["
				+ String.format("%.2f", trimestre2)
				+"] ["
				+ String.format("%.2f", trimestre3)
				+ "]";
		
	}
	
}
