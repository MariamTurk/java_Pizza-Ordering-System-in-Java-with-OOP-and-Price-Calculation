import java.util.ArrayList; // mariam turk , 1211115 , labsec:8L
import java.util.Arrays;
import java.util.Collections;
public class Driver {

	public static void main(String[] args) {
		ArrayList<PizzaOrder>ord=new ArrayList<>();
		//
ord.add(new Delivery("Ahmad",PizzaOrder.LARGE,3,10,10,3));
ord.add(new Delivery("Suha",PizzaOrder.MEDIUM,2,5,20,2));
ord.add(new ToGo("Ribhi", PizzaOrder.MEDIUM,4,5));
ord.add(new Seated ("Rana", PizzaOrder.SMALL,3,1,2,3));
ord.add(new Seated("Jamal", PizzaOrder.LARGE,4,2,4,5));

Collections.sort(ord);
//for(int i =0;i<ord.size();i++) {
	//ord.get(i).printOrderInfo();
//}
for(PizzaOrder i : ord)

System.out.println(i.printOrderInfo());

System.out.println(" ");
System.out.println("Total sum of Order Prices = " + calculateTotalOrdersPrice(ord));

System.out.println("\n" + ord.get(1).toString() + "\n"+"order price:" +(int) ord.get(1).calculateOrderPrice());

}
	static double calculateTotalOrdersPrice(ArrayList<PizzaOrder>array) {
		double t =0;
		for(PizzaOrder i : array)
			t+=i.calculateOrderPrice();
		return t; 
	}

}