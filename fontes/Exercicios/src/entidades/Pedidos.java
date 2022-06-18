package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.Status;



public class Pedidos {
	private Integer idPed;
	private Date momento;
	private Status status;
	private Cliente cliente;
	List<ItemPedido> listaItensPedido = new ArrayList<ItemPedido>();
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh24:mm:ss");
	
	public Pedidos(Integer idPed, Date momento, Status status, Cliente cliente) {
		this.idPed = idPed;
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Pedidos(Integer idPed,Date momento, Status status) {
		this.idPed = idPed;
		this.momento = momento;
		this.status = status;
	}
	
	public Integer getIdPed() {
		return idPed;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Date getMomento() {
		return momento;
	}

	public Status getStatus() {
		return status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItemPedido(ItemPedido itemPedido) {
		listaItensPedido.add(itemPedido);
	}
	
	public void remItemPedido(ItemPedido itemPedido) {
		listaItensPedido.remove(itemPedido);
	}
	
	public Double totalPagar() {
		Double total = 0.0;
		for(ItemPedido ip : listaItensPedido) {
			total += ip.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(Status.REALIZADO.toString() == "REALIZADO") {
			sb.append("Pedido realizado em "+sdf.format(momento));
			sb.append('\n');
			sb.append("Nrº :"+idPed+'\n');
			sb.append("Cliente: "+cliente.getNome());
			sb.append('\n');
			sb.append("Itens pedidos");
			sb.append('\n');
			for(ItemPedido ip : listaItensPedido) {
				sb.append("Descricao: "+ip.getProduto().getNome()+" - R$ "+String.format("%.2f", ip.subTotal())+" - "+ip.getQuantidade()+'\n');
			}
			sb.append("Total de itens: "+listaItensPedido.size()+'\n');
			sb.append("Total a pagar: "+String.format("%.2f", totalPagar())+'\n');
			sb.append("Entregar em: ");
			sb.append(cliente.getEndereco());
			return sb.toString();
		}else {
			sb.delete(0,sb.length());
			sb.append("Não há pedidos");
			return sb.toString();
		}
		
	}
}
