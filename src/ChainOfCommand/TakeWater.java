package ChainOfCommand;

import java.util.Optional;

import Singleton.WaterReservoir;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TakeWater extends ICommand{

	ICommand command;
	GraphicsContext gc;
	double bX=630,bY=778;
	public TakeWater(ICommand command,GraphicsContext gc) {
		
		this.command=command;
		this.gc=gc;
		
	}
	@Override
	public void executeRequest() {
		
		
		WaterReservoir waterReservoir=WaterReservoir.getInstance();
		double totalwater=waterReservoir.getTotalwater();
		double minlevel=waterReservoir.getMinlavel();
		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle("Water Request");
		dialog.setHeaderText("Remaining Water : "+totalwater+"Litre");
		dialog.setContentText("Please enter your water quantity..");

		Optional<String> result = dialog.showAndWait();
		
		
		
		if (result.isPresent()){
			
			double quantity = 0;
			if(result.get().length()>0) {
				quantity=Double.parseDouble(result.get());
			}
			
			if(totalwater>minlevel) {
				
				if(quantity>minlevel) {
    				
    				Alert alert = new Alert(AlertType.CONFIRMATION);
    	    		alert.setTitle("");
    	    		alert.setHeaderText("Sorry");
    	    		alert.setContentText("You cann't greater 10 litre water at time");

    	    		Optional<ButtonType> result2 = alert.showAndWait();
    			}
    			else {
    				
    				if(result.get().length()>0&&(totalwater-quantity)>=minlevel) {
    					totalwater=totalwater-quantity;
    					waterReservoir.setTotalwater(totalwater);
    					
    					gc.setFill(Color.GRAY);
    			    	gc.fillRect(600,600,150,200);
    					
    					gc.setFill(Color.WHITE);
    			    	gc.fillRect(600,800-totalwater*4,150,totalwater*4);
    			    	
    			    	gc.setFill(Color.BLUE);
    			    	gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));
    			    	gc.fillText("Water Reservoir",618,680);
    			    	gc.setFill(Color.BLUE);
    			    	gc.fillRect(622,752,100,40);
    			    	gc.setFill(Color.WHITE);
    			    	gc.fillText("Take Water",bX,bY);
    					
    				}
	    			
    				
    				
    			}
    			
				
			}
			else{
				
				
				command.executeRequest();
				
	    		
			}
			
		}
		
	}

	

}
