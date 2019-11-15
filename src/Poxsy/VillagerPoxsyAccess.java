package Poxsy;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class VillagerPoxsyAccess implements CafeAccessibilty{

	@Override
	public boolean enterCafe(String s) {
		
		
		if(s.equalsIgnoreCase("villager")) {
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("");
			alert.setHeaderText("Accessibility denied");
			alert.setContentText("You are not valid user");
			
			Optional<ButtonType> result2 = alert.showAndWait();
			return false;
		}
		else {
			
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("");
			alert.setHeaderText("You are allowed");
			alert.setContentText("");
			
			Optional<ButtonType> result2 = alert.showAndWait();
		}
		
		return true;
	}

}
