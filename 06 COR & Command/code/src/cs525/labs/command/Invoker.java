package cs525.labs.command;

import java.util.Stack;

public class Invoker {

	Stack<TransformSquare> commands = new Stack<>();

	public void transformSquare(TransformSquare command) {

		command.execute();
		commands.push(command);

	}

	public void undoTransformation() {
		System.out.println("UNDO: reverting changes");
		TransformSquare prevCommand = commands.pop();
		prevCommand.undo();
	}

}
