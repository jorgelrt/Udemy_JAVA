package aulas.Secao8;

public class Funcionario {
	public String nome;
	public double GrossSalary;
	public double tax ;
	
	public void IncreaseSalary(double percentage) {
		GrossSalary += (GrossSalary * (percentage / 100));
	}
	
	public String toString() {
		return "Employee: "
				+ nome
				+", $ "
				+String.format("%.2f", GrossSalary);
	}
	
}
