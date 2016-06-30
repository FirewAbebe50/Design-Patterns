package cs525.labs.memento;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author OWNER
 */
public class mementoController {

    @FXML
    private TextField userName, userAddress, userEmail, userContact;

    @FXML
    public Label errorMessage;

    int momentoSize;
    Person person;
    CareTaker caretaker = new CareTaker();
    Originator originator = new Originator();

    @FXML
    public void handleButtonLoadClick(ActionEvent e) {
        System.out.println("handleButtonLoadClick");
        errorMessage.setText("No Data had been Saved previously.");
    }

    @FXML
    public void handleButtUndoClick(ActionEvent e) {
        System.out.println("handleButtUndoClick");

        if (momentoSize > 1) {
            originator.restoreFromMemento(caretaker.getMemento(--momentoSize));
            momentoSize--;

            person = (caretaker.getMemento(momentoSize)).getSavedState();
            userName.setText(person.getName());
            userAddress.setText(person.getAddress());
            userEmail.setText(person.getEmail());
            userContact.setText(person.getContact());
        } else {
            userName.setText(null);
            userAddress.setText(null);
            userEmail.setText(null);
            userContact.setText(null);
        }
    }

    public void handleButtonSaveClick(ActionEvent e) {
        System.out.println("handleButtonSaveClick");

        errorMessage.setText("User Saved Successfully !");
        if (userName.getText().isEmpty() || userAddress.getText().isEmpty()
                || userEmail.getText().isEmpty() || userContact.getText().isEmpty()) {
            errorMessage.setText("Fill Up all fields properly.");
        } else {

            person = new Person(userName.getText(), userAddress.getText(), userEmail.getText(), userContact.getText());
            originator.set(person);
            caretaker.addMemento(originator.saveToMemento());
            momentoSize++;
            errorMessage.setText("User Saved Successfully !");
        }
    }

    @FXML
    void textFieldEvent(KeyEvent event) {

        errorMessage.setText(null);

        person = new Person(userName.getText(), userAddress.getText(), userEmail.getText(), userContact.getText());
        originator.set(person);
        caretaker.addMemento(originator.saveToMemento());
        momentoSize++;

    }

}
