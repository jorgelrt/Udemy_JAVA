package aplicacao;

import java.io.File;
import java.util.Scanner;

public class ObtendoInformacoesArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o caminho do arquivo: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		//acessar somente o nome do arquivo e não o caminho completo
		System.out.println("Nome do Arquivo: "+path.getName());//obtem o nome do arquivo
		//obtendo somente o caminho do arquivo
		System.out.println("Nome do caminho: "+path.getParent());
		//obtendo caminho completo
		System.out.println("Todo o caminho: "+path.getPath());
		
	}

}
