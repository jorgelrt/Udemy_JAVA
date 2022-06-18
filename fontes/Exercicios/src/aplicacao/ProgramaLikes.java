package aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import entidades.Comentario;
import entidades.Post;

public class ProgramaLikes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		List<Post> listaPosts = new ArrayList<Post>();
		boolean flag = true;
		
		try {
			while(flag == true) {
				System.out.println("01 - Postar");
				System.out.println("02 - Comentar uma postagem");
				System.out.println("03 - Dar like a uma postagem");
				System.out.println("04 - Ver postagens");
				
				System.out.print("Informe a opção: ");
				int opc = sc.nextInt();
				sc.nextLine();
				System.out.println("");
				switch (opc) {
				case 1:
					System.out.print("Titulo: ");
					String titulo = sc.nextLine();
					System.out.print("conteudo: ");
					String conteudo = sc.nextLine();
					listaPosts.add(new Post(r.nextInt(100), new Date(), titulo, conteudo));
					System.out.println("Postagem concluida");				
					break;
				case 2:
					for(Post p : listaPosts) {
						System.out.println(p);
					}
					System.out.println("");
					System.out.print("Informe o id: ");
					Integer id = sc.nextInt();
					sc.nextLine();
					for(Post p : listaPosts) {
						if(p.getId().equals(id)) {
							System.out.print("Comentario: ");
							String comentario = sc.nextLine();
							p.addComentario(new Comentario(comentario));
						}
					}
					break;
				case 3:
					for(Post p : listaPosts) {
						System.out.println(p);
					}
					System.out.println("");
					System.out.print("Informe o id: ");
					id = sc.nextInt();
					sc.nextLine();
					for(Post p : listaPosts) {
						p.darLikes();
					}
					break;
				case 4:
					for(Post p : listaPosts) {
						System.out.println(p);
					}
				}
				System.out.print("Continuar?(S/N): ");
				char continuar = sc.next().charAt(0);
				continuar = Character.toUpperCase(continuar);
				if(continuar != 'S') {
					flag = false;
				}
				System.out.println("");
				
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
