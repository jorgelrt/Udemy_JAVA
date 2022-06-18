package aplicacao;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//usuário irá digitar uma pasta
		System.out.println("Informe uma pasta: ");
		String strPath = sc.nextLine();
		//pode ser caminho de um arquivo qto de uma pasta
		File path = new File(strPath);
		//listar todas as pastas a partir deste caminho
		File[] varFolders = path.listFiles(File::isDirectory);//Cria um vetor e joga a lista contendo somente diretórios
		System.out.println("FOLDERS: ");
		for(File f: varFolders) {
			System.out.println(f);
		}
		//listando somente os arquivos
		File[] varFiles = path.listFiles(File::isFile);//Cria um vetor contendo somente a lista dos arquivos
		System.out.println("Files:");
		for(File f : varFiles) {
			System.out.println(f);
		}
		//criando subpasta
		boolean sucess = new File(strPath+"\\arquivos txt" + "\\subdir").mkdir();//criada subpasta
		System.out.println("Diretório criado com sucesso "+sucess);
		File path2 = new File(strPath+"\\arquivos txt");//informo o caminho "path"
		File[] varFolders2 = path2.listFiles(File::isDirectory);//Crio um vetor comtendo somente a lista de diretórios
		for(File f: varFolders2) {
			System.out.println(f);
		}
		sc.close();
	}
}
