package generalclasses;
	
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Optional;

import CommandPatter.Redo;
import CommandPatter.Start;
import CommandPatter.Stop;
import CommandPatter.Undo;
import CommandPatter.FactoryClass;
import CommandPatter.Marriage;
import Facade.Facade;
import abstractfactory.GreenLandFactory;
import abstractfactory.MadagascarFactory;
import flyweight.FlyWeightFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import madagascarisland.MadagascarHut;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class Main extends Application {
	BorderPane root;
	GraphicsContext gc;
	Canvas canvas;
	int width;
	int height;
	Pane mainPane;
	boolean startMarriage=false;
	FactoryClass factoryClass=new FactoryClass();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
			width = gd.getDisplayMode().getWidth();
			height = gd.getDisplayMode().getHeight();
			root = new BorderPane();
			
			initLayout();
			
			Scene scene = new Scene(root,width,height,Color.GRAY);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initLayout() {
		
	   
		mainPane=new Pane();
 		mainPane.setStyle("-fx-background-color:black;");
 		mainPane.setMinSize(600, 700);
 		canvas=new Canvas(2000,1000);
 		gc = canvas.getGraphicsContext2D();
 		mainPane.getChildren().add(canvas);
 		
 		

		Pane right = new Pane();
		right.setMaxSize(200,500);
		right.setMinSize(300,870);
		right.setStyle("-fx-background-color: #CD5C5C;");
		root.setRight(right);
		
		 VBox vbox2 = new VBox(18); // spacing = 8
		 vbox2.setAlignment(Pos.CENTER);
		 vbox2.setMinSize(300,400);
		 Button greenLand = new Button("GreenLand");
		 greenLand.setFont(Font.font ("serif", 24));
		 greenLand.setMinSize(180,40);
		 
		 greenLand.setOnAction(new EventHandler<ActionEvent>() {
			    @Override 
			    public void handle(ActionEvent e) {
			    	
			    	Facade facade=new Facade(gc,canvas);
			    	facade.createIslandEnvironment(new GreenLandFactory(gc));
			    }
		});
		 Button madagascar = new Button("Madagascar"); 
		 madagascar.setFont(Font.font ("serif", 24));
		 madagascar.setMinSize(180,40);
		 
		 madagascar.setOnAction(new EventHandler<ActionEvent>() {
			    @Override 
			    public void handle(ActionEvent e) {
			    	
			    	Facade facade=new Facade(gc,canvas);
			    	facade.createIslandEnvironment(new MadagascarFactory(gc));
			    	
			    }
		});
		 vbox2.getChildren().addAll(greenLand,madagascar);
		 right.getChildren().add(vbox2);
		 
		 Pane left = new Pane();
		 left.setMinSize(20,400);
		 left.setStyle("-fx-background-color: #1565C0;");
		
		Pane anchorpane = new Pane();
		Button buttonSave = new Button("Save");
		Button buttonCancel = new Button("Cancel");
		anchorpane.setStyle("-fx-background-color: #A9A9A9;");
		HBox hb = new HBox();
		hb.getChildren().addAll(buttonSave, buttonCancel);
		anchorpane.getChildren().addAll(hb);
		anchorpane.setMinSize(300, 100);
		AnchorPane.setRightAnchor(hb, 10.0);
		
		root = new BorderPane();
		StackPane bottom=new StackPane();
		bottom.setStyle("-fx-background-color: #1565C0;");
		bottom.setMinSize(300, 200);
	
		root.setCenter(mainPane);
		root.setBottom(bottom);
		
		
		Button command1 = new Button("Redo");
		command1.setFont(Font.font ("serif", 16));
		command1.setMinSize(90,50);
		vbox2.setMinSize(300,400);
		Button command2 = new Button("Undo");
		command2.setFont(Font.font ("serif", 16));
		command2.setMinSize(90,50);
		
		Button write = new Button("Write Principle..");
		write.setFont(Font.font ("serif", 16));
		write.setMinSize(120,50);
		anchorpane.setStyle("-fx-background-color: #A9A9A9;");
		HBox hb2 = new HBox();
		hb2.setAlignment(Pos.CENTER);
		
		
		Button start= new Button("Start Marriage");
		start.setFont(Font.font ("serif", 16));
		start.setMinSize(90,50);
		
		Button stop= new Button("Stop Marriage");
		stop.setFont(Font.font ("serif", 16));
		stop.setMinSize(90,50);
		
		
		hb2.getChildren().addAll(command1, command2,write,start,stop);
		bottom.getChildren().add(hb2);
		write.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent e) {
		    	
		    	TextInputDialog dialog = new TextInputDialog("");
				dialog.setHeaderText("Marriage");
				dialog.setContentText("Please Write Your Principle..");

				Optional<String> result = dialog.showAndWait();
				
				
				
				if (result.isPresent()){
					
					double quantity = 0;
					if(result.get().length()>0&&startMarriage) {
						
						factoryClass.addCommand(new Redo(result.get(),930,570+(factoryClass.command.size()*18),gc,new Marriage(gc)));
					}
				
				}
		    	
		    	
		    }
		});
		command2.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent e) {
		    	
		    	factoryClass.undo();
		    	
		    }
		});
		command1.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent e) {
		    	
		    	factoryClass.redo();
		    	
		    }
		});
		
		start.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent e) {
		    	
		    	startMarriage=true;
		    	factoryClass.addCommand(new Start(new Marriage(gc)));
		    	
		    }
		});
		stop.setOnAction(new EventHandler<ActionEvent>() {
		    @Override 
		    public void handle(ActionEvent e) {
		    	
		    	startMarriage=false;
		    	factoryClass.addCommand(new Stop(new Marriage(gc)));
		    	
		    }
		});
		
		root.setLeft(left);
		root.setRight(right);
		
		Facade facade=new Facade(gc,canvas);
    	facade.createIslandEnvironment(new MadagascarFactory(gc));
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}


