package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
	public static void main(String[] args) {
		/*
		 * Cria/recria o arquivo: new FileWriter(path)
		 * Acrescenta ao arquivo existente: new FileWriter(path, true)
		 * 
		 * obs:
		 * BufferedWriter (mais rápido)
		 */
		String[] vetLinhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};//cria vetor populado - origem leitura
		//criando o arquivo
		String path = "C:\\Users\\jorge\\OneDrive\\Documentos\\CURSO JAVA UDEMY\\arquivos txt\\arquivoCriado.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for(String l : vetLinhas) {
				bw.write(l);//escreve linha do vetor no arquivo
				bw.newLine();//pula linha
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
