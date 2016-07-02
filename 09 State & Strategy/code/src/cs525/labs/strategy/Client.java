package cs525.labs.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<Flight> flights = new ArrayList<>();

		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());
		flights.add(new Flight());

		AirlinePricingModeler modeler = new AirlinePricingModeler();
		modeler.setStrategy(new MultiClassStrategy(200));
		System.out.println("Total Revenue: $" + modeler.calculateRevenue(flights));

	}
}
