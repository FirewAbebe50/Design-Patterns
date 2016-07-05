package cs525.labs.mediator;

public abstract class User {

	protected BoardMediator mediator;
	protected String name;

	public User(BoardMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void place(Ball ball);
	public abstract void receiveTurn();

}
