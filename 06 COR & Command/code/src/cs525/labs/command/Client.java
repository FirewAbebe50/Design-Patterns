package cs525.labs.command;

public class Client {

	public static void main(String[] args) {

		Square s = new Square(200);

		// First Command - Create 200
		TransformSquare create = new CreateSquare(s);
		Invoker invoker = new Invoker();
		invoker.transformSquare(create);

		// Second Command - Move Right 20
		TransformSquare move = new MoveRightSquare(s, 20);
		invoker.transformSquare(move);

		// Third Command - Scale 2
		TransformSquare scale = new ScaleSquare(s, 2);
		invoker.transformSquare(scale);

		//invoker.undoTransformation();
//		invoker.undoTransformation();
	}
}
