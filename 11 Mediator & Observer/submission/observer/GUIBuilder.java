package cs525.labs.observer;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GUIBuilder extends Application  implements Observer{

	@FXML
	private Label namesLabel;
	private List<String> names;

	public GUIBuilder() {
		
	}
	
	public GUIBuilder(Subject nameHolder) {
		names = new ArrayList<>();
		nameHolder.attach(this);
	}

	@Override
	public void update(List<String> names) {
		this.names = names;

		display();
	}

	private void display() {
		String nameList = "";
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			nameList += names.get(i) + "\n";
		}

		if(namesLabel != null)
			namesLabel.setText(nameList);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
