package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.enums.StatusPedido;

public class Pedido {
	public final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer id;
	private Date data;
	private StatusPedido status;
	
	public Pedido(Integer id, Date data, StatusPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	public Date getData() {
		return data;
	}
	public void setDate(Date data) {
		this.data = data;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + sdf.format(data) + ", status=" + status + "]";
	}
	
	
}
