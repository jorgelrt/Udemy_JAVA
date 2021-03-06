package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private Date manufactureDate;

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	
	public Date getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+" (Usado) $ "+getPrice()+" Data Fabricacao: "+sdf.format(manufactureDate)+")");
		return sb.toString();
	}
}
