package generalclasses;
	
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import abstractfactory.GreenLandFactory;
import abstractfactory.MadagascarFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
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
		
		Pane mainPane=new Pane();
		mainPane.setStyle("-fx-background-color:black;");
		mainPane.setMinSize(600, 700);
		canvas=new Canvas(1200,1000);
		
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
		
			    	
			    	/*Flora flora=new GreenLandFactory(gc).getFlora("bigtree");
			    	flora.createFlora();*/
			    	Fauna fauna=new GreenLandFactory(gc).getFauna();
			    	fauna.createFauna();
			    }
		});
		 Button madagascar = new Button("Madagascar"); 
		 madagascar.setFont(Font.font ("serif", 24));
		 madagascar.setMinSize(180,40);
		 
		 madagascar.setOnAction(new EventHandler<ActionEvent>() {
			    @Override 
			    public void handle(ActionEvent e) {
		
			    	
			    	Flora flora=new MadagascarFactory(gc).getFlora("bigtree");
			    	flora.createFlora();
			    	flora=new MadagascarFactory(gc).getFlora("grass");
			    	flora.createFlora();
			    	
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
		
		root.setLeft(left);
		root.setRight(right);
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}


