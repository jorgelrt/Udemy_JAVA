package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;

public class ProgramaFinalLeituraEscritaArquivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> listaProd = new ArrayList<Produto>();
		//informo o caminho e nome do arquivo
		System.out.println("Informe o caminho do arquivo: ");
		String strArquivoOrigem = sc.nextLine();
		//Transformo p objeto File p/ obter o caminho do arquivo de origem
		File arqOrigem = new File(strArquivoOrigem);
		String dirRaiz = arqOrigem.getParent();
		//Crio o diretorio dentro do diretorio raiz do arquivo de origem
		Boolean sucess = new File(dirRaiz+"\\out").mkdir();
		//informo o caminho e nome do arquivo alvo				
		String dirAlvo = dirRaiz+"\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(strArquivoOrigem)))){
			String linha = br.readLine();
			while(linha != null) {
				String[] campos = linha.split(","); //crio um vetor com os dados da linha retornada do arquivo de origem
				//insiro os valores nas variáveis para popular objeto Produto à frente
				String nome = campos[0];
				Double preco = Double.parseDouble(campos[1].trim());
				int qtd = Integer.parseInt(campos[2].trim());
				//add na lista de produtos, instanciando o produto
				listaProd.add(new Produto(nome, preco, qtd));
				//print da linha no ecrãn
				System.out.println(linha);
				//leitura de nova linha - while
				linha = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(dirAlvo)))){
				for(Produto p : listaProd) {
					if(sucess == true) {
						bw.write("Produto: "+p.getNome()+" | valor total: R$ "+p.valorTotal());
						bw.newLine();
					}
					
				}
			}
			catch(IOException e) {
				System.out.println("Erro escrita: "+e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Erro leitura: "+e.getMessage());
		}

	}

}
