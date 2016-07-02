package cs525.labs.strategy;

import java.util.List;

public interface Model {

	long baseTicketPrice = 300;
	long fixedCost = 50000;
	
	long getRevenue(List<Flight> flights);
}
