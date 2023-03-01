package aulas.Secao4_Estrutura_Sequencial;

public class conversaoCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * as variáveis a e b são do tipo int e qdo há operação entre dois inteiros
		 * o compilador deduz que o resultado deve ser inteiro, por isso
		 * resultado = 2
		 */
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a/b;
		System.out.println(resultado);
		
		/*
		 * Para ter o resultado como do tipo double, precisamos informar ao 
		 * compilador, através de um cast
		 */
		
		resultado = (double)a/b;
		System.out.println(resultado);
		
		/*
		 *faremos o contrário e vemos perda de valor
		 */
		 double c;
		 int d;
		 
		 c = 10.5;
		 System.out.println(c);
		 d = (int)c;
		 System.out.println(d);
				 
	}

}
