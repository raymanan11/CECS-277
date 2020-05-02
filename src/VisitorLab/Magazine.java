package VisitorLab;


public class Magazine implements ItemElement {
	private double price;
	private String title;
	private String vdate;

	public Magazine(String ititle, String ivdate, double iprice)
	{
		title=ititle;
		vdate=ivdate;
		price=iprice;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public double getPrice()
	{
		return price;
	}

	public String getTitle()
	{
		return title;
	}
	public String getVdate()
	{
		return vdate;
	}


}