package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ImportedProduct;
import entidades.Product;
import entidades.UsedProduct;

public class ProgramaHeranca {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> listaProd = new ArrayList<Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Informe a quantidade de produtos a ser cadastrados");
			System.out.print(">>: ");
			int qtd = sc.nextInt();
			
			for(int i=0;i<qtd;i++) {
				System.out.println("Produto #"+(i+1)+" data");
				System.out.println("Comum, usado ou importado (C/U/I)");
				System.out.print(">>: ");
				char tipoProd = sc.next().charAt(0);
				tipoProd = Character.toUpperCase(tipoProd);
				sc.nextLine();
				System.out.print("Descricao: ");
				String name = sc.nextLine();
				System.out.print("Preco: ");
				Double price = sc.nextDouble();
				if(tipoProd == 'C') {
					listaProd.add(new Product(name, price));
				}
				if(tipoProd == 'U') {
					System.out.print("Data da fabricacao (dd/mm/yyyy): ");
					Date y = sdf.parse(sc.next());
					listaProd.add(new UsedProduct(name, price, y));
				}
				if(tipoProd == 'I') {
					System.out.print("Taxa de importacao: ");
					Double customsFee = sc.nextDouble();
					listaProd.add(new ImportedProduct(name, price, customsFee));
				}
			}
			System.out.println("ETIQUETA DE PRECO");
			for(Product prod : listaProd) {
				System.out.println(prod.priceTag());
			}
					

		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
	}
}
