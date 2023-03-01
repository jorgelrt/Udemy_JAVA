package aulas.Secao8;

public class Aluno {
	public String nome;
	public double nota1B;
	public double nota2B;
	public double nota3B;
	
	public double CalcFinal() {
		return nota1B + nota2B + nota3B;
	}
	
	public String Resultado(double media) {
		if(media >= 60.0) {
			return "PASS";
		}else {
			return "FAILED";
		}
	}
	
	public double MissPoints(double media) {
		return 100 - media;
	}
	
}
