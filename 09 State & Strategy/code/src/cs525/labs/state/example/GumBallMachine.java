package cs525.labs.state.example;

public class GumBallMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;

	private State currentState = soldOutState;
	private int count = 0;

	public GumBallMachine(int numGumballs) {

		soldOutState = new SoldoutState(this);
		noQuarterState = new NoQuarterState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);

		this.count = numGumballs;
		if (count > 0) {
			currentState = noQuarterState;
		}

	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + currentState + "\n");
		return result.toString();
	}

	void refill(int count) {
		this.count = count;
		currentState = noQuarterState;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertQuarter() {
		currentState.insertQuarter();
	}

	public void ejectQuarter() {
		currentState.ejectQuarter();
	}

	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}

}
