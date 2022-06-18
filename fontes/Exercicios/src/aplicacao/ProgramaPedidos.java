package aplicacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedidos;
import entidades.Produto;
import entidades.enums.Status;

public class ProgramaPedidos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
		Random rCliente = new Random();
		Random rProduto = new Random();
		Random rPedido = new Random();
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		List<Produto> listaProdutos = new ArrayList<Produto>();
		List<ItemPedido> listaItensPedidos = new ArrayList<ItemPedido>();
		List<Pedidos> listaPedidosRealizados = new ArrayList<Pedidos>();
		
		boolean flag = true;
		
		try {
			while(flag == true) {
				System.out.println("01 - Cadastrar Cliente");
				System.out.println("02 - Cadastrar Produtos");
				System.out.println("03 - Fazer um Pedido");
				System.out.println("04 - Ver Pedidos");
				System.out.println("05 - Alterar status pedido");
				
				
				System.out.print("Informe a opcao: ");
				int opc = sc.nextInt();
				sc.nextLine();
				
				switch(opc) {
				case 1: 
					System.out.print("Nome: ");
					String nome = sc.nextLine();
					System.out.print("Tel/Cel.: ");
					String tel = sc.nextLine();
					System.out.print("End: ");
					String end = sc.nextLine();
					listaClientes.add(new Cliente(rCliente.nextInt(100), nome, tel, end));
					for(Cliente c : listaClientes) {
						System.out.println(c);
					}
					/*
					System.out.println("Cliente cadastrado!");
					System.out.println("Nome: "+nome);
					System.out.println("Tel/Cel.: "+tel);
					System.out.println("Endereco: "+end);
					*/
					break;
				case 2:
					boolean flag3 = true;
					while(flag3 == true) {
						System.out.print("Descricao: ");
						String nmProd = sc.nextLine();
						System.out.print("Preco: ");
						Double preco = sc.nextDouble();
						sc.nextLine();
						listaProdutos.add(new Produto(rProduto.nextInt(100), nmProd, preco));
						System.out.println("Continuar cadastrando?(S/N): ");
						char cont3 = sc.next().charAt(0);
						sc.nextLine();
						cont3 = Character.toUpperCase(cont3);
						if(cont3 != 'S') {
							flag3 = false;
						}
					}
					
					break;
				case 3:
					Integer codProd = 0;
					String descProd = "";
					Double precoProd = 0.0;
					Double precoProd2 = 0.0;
					int qtdPedida = 0;
					Integer idCli = 0;
					String nmCli = "";
					String telCli = "";
					String endCli = "";
					Cliente c1;
					for(Produto p : listaProdutos) {
						System.out.println(p.getCodigo()+" - "+p.getNome()+" R$ "+String.format("%.2f", p.getPreco()));
					}
					boolean flag2 = true;
					while(flag2==true) {
						System.out.print("Informe o codigo p/ add o produto a seu pedido: ");
						int codigoEscolhido = sc.nextInt();
						sc.nextLine();
						System.out.print("Informe a quantidade desejada: ");
						qtdPedida = sc.nextInt();
						for(Produto p : listaProdutos) {
							if(codigoEscolhido == p.getCodigo()) {
								codProd = p.getCodigo();
								descProd = p.getNome();
								precoProd = p.getPreco();
								precoProd2 = precoProd;
								listaItensPedidos.add(new ItemPedido(qtdPedida, p.getPreco(), new Produto(codProd, descProd, precoProd)));
							}
							
						}
						System.out.print("Continuar add produtos? (S/N): ");
						char continuar = sc.next().charAt(0);
						continuar = Character.toUpperCase(continuar);
						if(continuar != 'S') {
							flag2 = false;
						}
						
						}
					System.out.print("Informe seu codigo de identificacao do cliente: ");
					Integer codIdentCliente = sc.nextInt();
					sc.nextLine();
					for(Cliente c: listaClientes) {
						if(codIdentCliente.equals(c.getId())) {
							idCli = c.getId();
							nmCli = c.getNome();
							telCli = c.getTel();
							endCli = c.getEndereco();
							listaPedidosRealizados.add(new Pedidos(rPedido.nextInt(100),new Date(), Status.REALIZADO));
							
						}
					}
					for(Pedidos p : listaPedidosRealizados) {
						for(ItemPedido ip : listaItensPedidos) {
							codProd = ip.getProduto().getCodigo();
							descProd = ip.getProduto().getNome();
							precoProd = ip.getPreco();
							p.addItemPedido(new ItemPedido(ip.getQuantidade(), ip.getPreco(), new Produto(codProd, descProd, precoProd)));
						}		
					}
					for(Pedidos p : listaPedidosRealizados) {
						c1 = new Cliente(idCli, nmCli, telCli, endCli);
						//if(p.getCliente().getId().equals(codIdentCliente)) {
							p.setCliente(c1);
						//}
						
					}
					break;
				case 4:
					for(Pedidos p : listaPedidosRealizados) {
						if(p.getStatus().toString() != "ENTREGUE") {
							System.out.println(p);
						}
						
					}
					break;
				case 5:
					System.out.print("Informe o nr. do pedido: ");
					Integer BuscaIdPed = sc.nextInt();
					sc.nextLine();
					for(Pedidos p : listaPedidosRealizados) {
						if(p.getIdPed().equals(BuscaIdPed)) {
							p.setStatus(Status.ENTREGUE);
						}
					}
				default :
					System.out.println("Opcao invalida!");
				}
				System.out.print("Continuar execução?(S/N): ");
				char cont = sc.next().charAt(0);
				cont = Character.toUpperCase(cont);
				if(cont != 'S') {
					flag = false;
				}
				
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Erro de entrada de dados!");
		}
		finally {
			sc.close();
		}
		
	}
	
	
}
