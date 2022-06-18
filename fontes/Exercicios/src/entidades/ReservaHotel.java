package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservaHotel {
	private Integer nrQuarto;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ReservaHotel(Integer nrQuarto, Date checkin, Date checkout) {
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
	
	public void alteraDatas(Date checkin, Date checkout) {
		Date agora = new Date();
		if(checkin.before(agora) || checkout.before(agora)) {
			throw new IllegalArgumentException("As datas de alteracao não podem ser anterior a data atual");
		}
		if(!checkout.after(checkin)) {
			throw new IllegalArgumentException("Data de checkin é posterior a do checkout");
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
