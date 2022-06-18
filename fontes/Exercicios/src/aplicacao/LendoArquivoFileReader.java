package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivoFileReader {

	public static void main(String[] args) {
		//implementação básica padrão com fechamento manual
		//obtendo o endereço/caminho do arquivo completo
		String path = "C:\\Users\\jorge\\OneDrive\\Documentos\\CURSO JAVA UDEMY\\arquivos txt\\out.txt";
		//valores iniciais caso de treta no bloco try e as mesmas não sejam instanciadas
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));//instanciação
			String linha = br.readLine();//Lê a primeira linha - requisito while
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();//implementação while
			}
		}
		catch(IOException e){
			System.out.println("Erro "+e.getMessage());
		}
		finally {
				try {//pode ocorrer uma exception ao fechar as streams - por isso estão dentro do try
					if(fr != null) {
						fr.close();
					}
					if(br != null) {
						br.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
