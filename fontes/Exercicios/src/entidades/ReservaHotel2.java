package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.ReservaException;

public class ReservaHotel2 {
	private Integer nrQuarto;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservaHotel2(Integer nrQuarto, Date checkin, Date checkout) throws ReservaException {
		if(!checkout.after(checkin)) {
			throw new ReservaException("A data de checkout deve ser posterior a de checkin");
		}
		this.nrQuarto = nrQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNrQuarto() {
		return nrQuarto;
	}

	public void setNrQuarto(Integer nrQuarto) {
		this.nrQuarto = nrQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public long duracao() {
		long dias = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(dias, TimeUnit.MILLISECONDS);
	}
	
	public void alteraDatas(Date checkin, Date checkout) throws ReservaException {
		Date agora = new Date();
		if(checkin.before(agora) || checkout.before(agora)) {
			throw new ReservaException("As datas de alteracao não podem ser anterior a data atual");
		}
		if(!checkout.after(checkin)) {
			throw new ReservaException("Data de checkin é posterior a do checkout");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public String toString() {
		return   "Quarto: "
				+getNrQuarto()
				+", checkin: "
				+sdf.format(getCheckin())
				+", checkout: "
				+sdf.format(getCheckout())
				+". "
				+duracao()
				+" noites";
				
	}
}
