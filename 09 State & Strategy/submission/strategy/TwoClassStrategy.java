package cs525.labs.strategy;

import java.util.List;

public class TwoClassStrategy implements Model {

	private int numOfPassenger;

	public TwoClassStrategy(int numOfPassenger) {

		this.numOfPassenger = numOfPassenger;
	}

	@Override
	public long getRevenue(List<Flight> flights) {

		long revenue = (long) (numOfPassenger * 2/ 3.0 * 0.75 * baseTicketPrice
				+ numOfPassenger/ 3.0 * 1.5 * baseTicketPrice - 1.1 * fixedCost);
		long total = revenue * flights.size();
		return total;
	}

}
