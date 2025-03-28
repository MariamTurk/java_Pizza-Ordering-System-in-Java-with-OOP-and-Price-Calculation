import java.util.Date;

public class Seated extends PizzaOrder{
	double	serviceCharge;
	int numberOfPeople;
	public Seated(String coustomerName,  int pizzaSize, int numberOfToppings, double toppingPrice,
			double serviceCharge, int numberOfPeople) {
		super(coustomerName, pizzaSize, numberOfToppings, toppingPrice);
		this.serviceCharge = serviceCharge;
		this.numberOfPeople = numberOfPeople;
	}
	public Seated() {
		
	}
@Override
public String toString() {
return	super.toString() + 
		"Seated{" +
		"serviceCharge=" +
		serviceCharge +
		", numberOfPeople=" +
		numberOfPeople;
}
@Override
public double calculateOrderPrice() {
	double res =0 ;
	res = super.calculateOrderPrice() *(serviceCharge * numberOfPeople );
	return res;
}

}
