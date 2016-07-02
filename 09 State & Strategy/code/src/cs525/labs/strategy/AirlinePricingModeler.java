package cs525.labs.strategy;

import java.util.List;

public class AirlinePricingModeler {
	private Model strategy;

	public void setStrategy(Model strategy) {
		this.strategy = strategy;
	}

	public long calculateRevenue(List<Flight> flights) {
		return strategy.getRevenue(flights);
	}
}
