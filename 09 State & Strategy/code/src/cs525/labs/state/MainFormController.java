package cs525.labs.state;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainFormController extends Application {

	@FXML
	private TextField feedbackBox;
	@FXML
	private RadioButton regularRoad;
	@FXML
	private RadioButton wetRoad;
	@FXML
	private RadioButton gravelRoad;
	@FXML
	private RadioButton iceRoad;

	private RoadModel roadModel = new RoadModel();

	private RoadConditionFactory roadFactory = RoadConditionSimpleFactory.getInstance();

	@Override
	public void start(Stage arg0) throws Exception {

		System.out.println("Start");
	}

	@FXML
	protected void btnLeftAction(ActionEvent event) throws Exception {

		RoadCondition condition = roadFactory.getCondition(getType());
		roadModel.setCondition(condition);
		int val = roadModel.getLeft();
		feedbackBox.setText(roadModel.toString() + val);

		System.out.println("left");

	}

	@FXML
	protected void btnAccelerateAction(ActionEvent event) throws Exception {

		RoadCondition condition = roadFactory.getCondition(getType());
		roadModel.setCondition(condition);

		int val = roadModel.getAccel();
		feedbackBox.setText(roadModel.toString() + val);

		System.out.println("accelerate");

	}

	@FXML
	protected void btnRightAction(ActionEvent event) throws Exception {

		RoadCondition condition = roadFactory.getCondition(getType());
		roadModel.setCondition(condition);

		int val = roadModel.getRight();
		feedbackBox.setText(roadModel.toString() + val);

		System.out.println("right");

	}

	@FXML
	protected void btnBrakeAction(ActionEvent event) throws Exception {

		RoadCondition condition = roadFactory.getCondition(getType());
		roadModel.setCondition(condition);

		int val = roadModel.getBrake();
		feedbackBox.setText(roadModel.toString() + val);

		System.out.println("brake");

	}

	private String getType() {

		String type = "regular";
		if (wetRoad.isSelected())
			type = "wet";
		else if (gravelRoad.isSelected())
			type = "gravel";
		else if (iceRoad.isSelected())
			type = "ice";

		return type;

	}

}
