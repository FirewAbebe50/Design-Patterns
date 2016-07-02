package cs525.labs.state.example;

public class Client {

	public static void main(String[] args) {

		GumBallMachine gumballMachine = new GumBallMachine(3);
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
	}

}
