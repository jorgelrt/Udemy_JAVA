package entidades;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFee= customsFree;
	}

	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFee) {
		this.customsFee= customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()+" $ "+getPrice()+"(customs Fee: $ "+String.format("%.2f", totalPrice())+")");
		return sb.toString();
	}
}
