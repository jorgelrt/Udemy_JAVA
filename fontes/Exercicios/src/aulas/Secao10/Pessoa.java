package aulas.Secao10;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	//Construtor
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Outros métodos
	public double CalcAlturaMedia(Pessoa[] vetPessoa) {
		double somatorio = 0.0;
		for(int i=0; i<vetPessoa.length; i++) {
			somatorio += vetPessoa[i].getAltura();
		}
		return somatorio/vetPessoa.length;
	}
	
	public int CalcMediaMenores16(Pessoa[] vetMenores16) {
		int total = 0;
		for(int i = 0; i<vetMenores16.length; i++) {
			if(vetMenores16[i].getIdade()<16) {
				total += vetMenores16[i].getIdade();
			}
		}
		return ((total/vetMenores16.length) * 100);
	}
}
