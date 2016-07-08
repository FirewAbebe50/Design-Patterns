package cs525.labs.mediator;

public class UserImpl extends User{

	public UserImpl(BoardMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void place(Ball ball) {
		System.out.println(name + ": Placing ball " + ball + " on the board...");
		this.mediator.placeBall(ball, this);
		
	}

	@Override
	public void receiveTurn() {
		System.out.println("____Now, " + name + "'s turn_____");
		
	}

}
