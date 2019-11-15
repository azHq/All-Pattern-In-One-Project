package Facade;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ChainOfCommand.ICommand;
import ChainOfCommand.PayForWater;
import ChainOfCommand.TakeWater;
import Mediator.CityUser;
import Mediator.MediatorCafe;
import Mediator.VillagerUser;
import Observer.NoticeAdapter;
import Observer.Observer;
import Observer.Subjects;
import Poxsy.VillagerPoxsyAccess;
import Singleton.WaterReservoir;
import abstractfactory.AbstractFactory;
import abstractfactory.MadagascarFactory;
import flyweight.FlyWeightFactory;
import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Hut;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Facade {
	GraphicsContext gc;
	Canvas canvas;
	double bX=630,bY=778;
	Observer ob=new Observer();
	MediatorCafe mediator=new MediatorCafe();
	
	NoticeAdapter notice;
	
	public Facade(GraphicsContext gc,Canvas canvas) {
		
		this.gc=gc;
		this.canvas=canvas;
		notice=new NoticeAdapter(ob,gc);
	}
	
	public void createIslandEnvironment(AbstractFactory abstractFactory) {
	
		
		FlyWeightFactory.tree.clear();
    	FlyWeightFactory.hut.clear();
    	FlyWeightFactory.bird.clear();
    	
    	
    	
    	clearSignature(gc);
    	Image image = new Image(getClass().getResourceAsStream("/back1.jpg"));
    	gc.drawImage(image,0,0, 2000, 300);
    	gc.setFill(Color.GREEN);
    	gc.fillRect(0,250,2000,1000);
    	
    	
    	gc.setFill(Color.web("#00695C"));
		gc.fillRect(30,450,200,150);
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 16));
		gc.fillText("Climate Notice",60,470);
    	
		
    	/*gc.setFill(Color.BLACK);
		gc.fillRect(900,550,200,300);*/
		
		
		gc.setFill(Color.web("#5C6BC0"));
		gc.fillRect(1400,50,200,200);
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 16));
		gc.fillText("City Area",1460,90);
		
		mediator.addUser(new CityUser(gc,mediator,1440,140));
		
		
		
    	createWaterReservoir();
    	
    	Flora flora=abstractFactory.getFlora();
    	flora.createFlora();
    	Fauna fauna=abstractFactory.getFauna();
    	fauna.createFauna();
    	
    	Hut hut=abstractFactory.getHuts();
    	hut.createRuralHut(ob,mediator);
    	
    	gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 16));
		gc.fillText("Climate Office",1280,670);
		
		gc.setFill(Color.BLUE);
		gc.fillRect(1250,770,60,30);
		
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD,10));
		gc.fillText("Update Notice",1250,790);
		
		gc.setFill(Color.BLUE);
		gc.fillRect(1350,770,60,30);
		
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD,10));
		gc.fillText("Give Alarm",1350,790);
		
		gc.setFill(Color.web("#AFB42B"));
		gc.fillRect(1160,330,35,30);
		
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD,8));
		gc.fillText("Send msg to city",1145,330);
		
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD,10));
		gc.fillText("Enter",1215,320);
		
		
		
		
		gc.setFill(Color.web("#AFB42B"));
		gc.fillRect(1250,330,35,30);
		
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD,8));
		gc.fillText("Send msg to Village",1245,330);
		
		
		Subjects sub=new Subjects(gc,45,470);
		notice.addNoticeBoard(sub);
		
	}
	private void createWaterReservoir() {
	
    	gc.setFill(Color.WHITE);
    	gc.fillRect(600,600,150,200);
    	gc.setFill(Color.BLUE);
    	gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));
    	gc.fillText("Water Reservoir",618,680);
    	gc.setFill(Color.BLUE);
    	gc.fillRect(622,752,100,40);
    	gc.setFill(Color.WHITE);
    	gc.fillText("Take Water",bX,bY);
    	
    	
    	
    	canvas.setOnMouseClicked(event -> {
    		
    		
	    	if(event.getX()>bX&&event.getX()<(bX+100)&&event.getY()>(bY-40)&&event.getY()<(bY+40)) {
	    			
	    		
	    		new TakeWater(new PayForWater(ob),gc).executeRequest();
	    		
	    		
	    	}
	    	if(event.getX()>1250&&event.getX()<1310&&event.getY()>770&&event.getY()<800) {
	    	
	    		
	    		TextInputDialog dialog = new TextInputDialog("");
	    		dialog.setTitle("Notice");
	    		dialog.setHeaderText("Notice");
	    		dialog.setContentText("Please write your notice..");

	    		Optional<String> result = dialog.showAndWait();
	    		
	    		
	    		
	    		if (result.isPresent()){
	    			
	    			double quantity = 0;
	    			if(result.get().length()>0) {
	    				
	    				notice.updateNotice(result.get(),notice.getNumOfNotice()+1);
	    			}
	    		}
	    		
	    	}
	    	if(event.getX()>1350&&event.getX()<1410&&event.getY()>770&&event.getY()<800) {
	    	
	    		TextInputDialog dialog = new TextInputDialog("");
	    		dialog.setTitle("Notice");
	    		dialog.setHeaderText("Notice");
	    		dialog.setContentText("Please write your Alarm message..");

	    		Optional<String> result = dialog.showAndWait();
	    		
	    		
	    		
	    		if (result.isPresent()){
	    			
	    			double quantity = 0;
	    			if(result.get().length()>0) {
	    				
	    				notice.notifyObserver(result.get());
	    			}
	    		}
	    	}
	    	if(event.getX()>1160&&event.getX()<1195&&event.getY()>330&&event.getY()<360) {
	    		
	    		TextInputDialog dialog = new TextInputDialog("");
	    		dialog.setTitle("Notice");
	    		dialog.setHeaderText("Send Message to City");
	    		dialog.setContentText("Please write your message..");

	    		Optional<String> result = dialog.showAndWait();
	    		
	    		
	    		
	    		if (result.isPresent()){
	    			
	    			double quantity = 0;
	    			if(result.get().length()>0) {
	    				
	    				mediator.sendMessage(result.get(),1);
	    			}
	    		}
	    	}
	    	
	    	if(event.getX()>1215&&event.getX()<1240&&event.getY()>300&&event.getY()<380) {
	    		
	    		TextInputDialog dialog = new TextInputDialog("");
	    		dialog.setTitle("Enter your ");
	    		dialog.setHeaderText("Enter Your type");
	    	
	    		Optional<String> result = dialog.showAndWait();
	    		
	    		
	    		
	    		if (result.isPresent()){
	    			
	    			double quantity = 0;
	    			if(result.get().length()>0) {
	    				
	    				VillagerPoxsyAccess villagerPoxsyAccess=new VillagerPoxsyAccess();
	    				villagerPoxsyAccess.enterCafe(result.get());
	    			}
	    		}
	    	}
	    	if(event.getX()>1260&&event.getX()<1285&&event.getY()>330&&event.getY()<360) {
	    		
	    		TextInputDialog dialog = new TextInputDialog("");
	    		dialog.setTitle("Notice");
	    		dialog.setHeaderText("Send Message to Village");
	    		dialog.setContentText("Please write your message..");
	    	
	    		Optional<String> result = dialog.showAndWait();
	    		
	    		
	    		
	    		if (result.isPresent()){
	    			
	    			double quantity = 0;
	    			if(result.get().length()>0) {
	    				
	    				mediator.sendMessage(result.get(),2);
	    			}
	    		}
	    	}
	    	
	    	
	    		
        });
		
	}

	private void clearSignature(GraphicsContext gc) {
	    
	    gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
	   
	}


}
