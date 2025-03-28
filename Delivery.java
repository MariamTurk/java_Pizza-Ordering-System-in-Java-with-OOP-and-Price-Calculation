import java.util.Date;

public class Delivery extends PizzaOrder {
private double	tripRate;
private int zone;
public Delivery(String coustomerName, int pizzaSize, int numberOfToppings, double toppingPrice,
		double tripRate, int zone) {
	super(coustomerName,  pizzaSize, numberOfToppings, toppingPrice);
	this.tripRate = tripRate;
	this.zone = zone;
}
public Delivery(String coustomerName,  int pizzaSize, int numberOfToppings, double toppingPrice) {
	super(coustomerName, pizzaSize, numberOfToppings, toppingPrice);
}
public Delivery() {
	
}
public double getTripRate() {
	return tripRate;
}
public void setTripRate(double tripRate) {
	this.tripRate = tripRate;
}
public int getZone() {
	return zone;
}
public void setZone(int zone) {
	this.zone = zone;
}
@Override
public String toString() {
	
return 	super.toString() + 
		"\n"+ " Trip Rate" + tripRate
		 +
		"\n"+" zone=" + zone; 
			}
@Override
public double calculateOrderPrice() {
	double res = 0 ;
	res=super.calculateOrderPrice() + ((tripRate/100) * super.calculateOrderPrice() * zone);
	return res;
}
}
