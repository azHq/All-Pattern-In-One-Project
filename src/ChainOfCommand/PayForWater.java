package ChainOfCommand;

import java.util.Optional;

import Observer.Observer;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class PayForWater extends ICommand{

	Observer sub;
	public PayForWater(Observer sub) {
			this.sub=sub;
	}
	@Override
	public void executeRequest() {
		
		sub.notifyTheObserver("Please pray for water..");
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("");
		alert.setHeaderText("Insufficient Water");
		alert.setContentText("You have to pray for water");
		
		Optional<ButtonType> result2 = alert.showAndWait();
		
	}

}
