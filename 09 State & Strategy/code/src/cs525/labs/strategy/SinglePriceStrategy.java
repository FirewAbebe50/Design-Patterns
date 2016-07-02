package cs525.labs.strategy;

import java.util.List;

public class SinglePriceStrategy implements Model {

	private int numOfPassengers;

	public SinglePriceStrategy(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	@Override
	public long getRevenue(List<Flight> flights) {

		long revenue = numOfPassengers * baseTicketPrice - fixedCost;
		long totalRevenue = revenue * flights.size();
		return totalRevenue;
	}

}
