package cs525.labs.strategy;

import java.util.List;

public class MultiClassStrategy implements Model {

	private int numOfPassenger;

	public MultiClassStrategy(int numOfPassenger) {

		this.numOfPassenger = numOfPassenger;
	}

	@Override
	public long getRevenue(List<Flight> flights) {

		long revenue = (long) (numOfPassenger / 10.0 * 4 * baseTicketPrice
				+ numOfPassenger / 5.0 * 1.5 * baseTicketPrice + numOfPassenger * 7 / 10.0 * 0.75 * baseTicketPrice
				- 1.2 * fixedCost);
		long total = revenue * flights.size();

		return total;
	}

}
