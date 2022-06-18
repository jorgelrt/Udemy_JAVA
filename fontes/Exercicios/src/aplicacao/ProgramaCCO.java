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

public class ProgramaCCO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> listaCCOs = new ArrayList<String>();
		
		System.out.println("PROGRAMA GERADOR ARQUIVO CARGA - TUSS");
		
		System.out.print("Informe o caminho e nome do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		String dirOrig = path.getParent();
		//System.out.println(dirOrig);
		
		Boolean sucess = new File(dirOrig+"\\ArquivoCarga").mkdir();
		
		String dirAlvo = dirOrig+"\\ArquivoCarga\\carga.txt";
		
		//System.out.println(dirAlvo);
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File(strPath)))){
			String linha = br.readLine();
			while(linha != null) {
				String[] vetReg = linha.split(",");
				int tamVet = (vetReg.length - 1);
				while(tamVet >= 0) {
					//System.out.println(tamVet);
					listaCCOs.add(vetReg[tamVet]);
					//System.out.println(vetReg[tamVet]);
					tamVet-=1;	
				}
				linha = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(dirAlvo)))){
				int i = 0;
				for(String c : listaCCOs) {
					//System.out.println(c.toString());
					if(sucess == true) {
						bw.write("lista("+i+").CCO := "+"'"+c.toString()+"' ;");
						bw.newLine();
					}
				i++;	
				}
				System.out.println("Arquivo de carga criado");
			}
			catch(IOException e) {
				System.out.println("Erro escrita: "+e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Erro de leitura: "+e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}
		
		
	}
}
