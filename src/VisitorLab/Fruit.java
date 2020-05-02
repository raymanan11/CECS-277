package VisitorLab;

public class Fruit implements ItemElement {
	private double price;
	private int amount;
	private String name;

	public Fruit(String iname,int iamount,double iprice)
	{
		name=iname;
		price=iprice;
		amount=iamount;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return this.name;
	}

}