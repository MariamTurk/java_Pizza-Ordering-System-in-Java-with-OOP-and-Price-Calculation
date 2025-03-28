import java.util.Date;
public class PizzaOrder implements Comparable<PizzaOrder>{
	private String coustomerName;
	private Date dateOrdered;
	final static int SMALL=1;
	final static int MEDIUM=2;
	final static int LARGE=3;
	private int pizzaSize;
	private int numberOfToppings;
	private double toppingPrice;
	
	
	Date date= new Date();
	public PizzaOrder(String coustomerName, Date dateOrdered, int pizzaSize, int numberOfToppings,
			double toppingPrice) {
		
		this.coustomerName = coustomerName;
		this.dateOrdered = date;
		this.pizzaSize = pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
	}
	public PizzaOrder(String coustomerName, int pizzaSize, int numberOfToppings, double toppingPrice) {
		this.coustomerName = coustomerName;
		this.pizzaSize = pizzaSize;
		this.numberOfToppings = numberOfToppings;
		this.toppingPrice = toppingPrice;
	}
	public PizzaOrder() {
	
	}
	
	public String getCoustomerName() {
		return coustomerName;
	}
	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}
	public Date getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(Date dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	public String getPizzaSize() {
		String s = null;
		if (pizzaSize==1) {
			s= "small";
		}
		else if (pizzaSize==2) {
			s= "medium";
		}
		else { 
			s="large";}
		return s;
	}
	public void setPizzaSize(int pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public int getNumberOfToppings() {
		return numberOfToppings;
	}
	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}
	public double getToppingPrice() {
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
@Override
public String toString() {
	return "pizzaOrder{" +
"\n"+"customerName ='"+ coustomerName +'\''+ 
"\n"+"Date Ordered =" + date+
"\n"+"pizza Size ="+ getPizzaSize() +
"\n"+" Number of Topping ="+ numberOfToppings+
"\n"+" Topping Price =" + toppingPrice ;
}

public double calculateOrderPrice() {
	return ( numberOfToppings * toppingPrice ) * pizzaSize;
}
public void printOrderInfo() {
	System.out.println(coustomerName+"  "+calculateOrderPrice() );
}
@Override
public int compareTo(PizzaOrder p) {
	if (calculateOrderPrice() > p .calculateOrderPrice())
	{
		return 1;
	}
	else if (calculateOrderPrice() < p .calculateOrderPrice()) {
		return -1;
	}
	else {
		return 0;
	}
}
}
