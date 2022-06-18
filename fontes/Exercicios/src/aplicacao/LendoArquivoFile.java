package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivoFile {

	public static void main(String[] args) {
		//instanciado objeto file - encapsula todo o acesso
		File file = new File("C:\\Users\\jorge\\OneDrive\\Documentos\\CURSO JAVA UDEMY\\arquivos txt\\out1.txt");
		Scanner sc = null;//valor inicial
		//ao tentar instanciar Scanner - o programa vai tentar abrir o arquivo - obrigatório bloco try
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) { //testa se ainda existe uma nova linha no arquivo - retorno verdadeiro
				System.out.println(sc.nextLine());
			}
		}
		/*
		*catch (FileNotFoundException e) {
		*	System.out.println("Erro "+e.getMessage());
		*}
		*/
		catch(IOException e) { //exceção PADRAO que mexe com arquivos, mas poderia utilizar o acima
			System.out.println("Erro: "+e.getMessage());
		}
		finally {//fecha independente se deu certo ou não. 
			if(sc != null) {//Pode ser q deu um erro ao instanciar o Scanner bloco try - verificar o valor inicial
				sc.close();
			}
			System.out.println("Fim do programa");
		}
		

	}

}
