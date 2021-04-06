package networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DashboardTicTacToe extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		Button btCS2 = new Button("TicTacToe Server");
		btCS2.setOnAction(e -> {
			startDemo(new TicTacToeServer());
		});
		pane.add(btCS2, 1, 0);
		Button btCS3 = new Button("TicTacToe Client");
		btCS3.setOnAction(e -> {
			startDemo(new TicTacToeClient());
		});
		pane.add(btCS3, 2, 0);
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Networking Demo's");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void startDemo(Application demo) {
    	
    	Platform.runLater(()->{
    		try {
    				demo.start(new Stage());
    		} catch (Exception e) {
    			e.printStackTrace();
    		};
    	});
	}
}