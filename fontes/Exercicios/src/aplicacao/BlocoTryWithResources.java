package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryWithResources {

	public static void main(String[] args) {
		//melhor para mexer com streams - Grupo: Arquivos
		/*
		 * é um bloco que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco disponivel java 7 em diante
		 */
		String path = "C:\\Users\\jorge\\OneDrive\\Documentos\\CURSO JAVA UDEMY\\arquivos txt\\out.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String linha = br.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Erro: "+e.getMessage());
		}

	}

}
