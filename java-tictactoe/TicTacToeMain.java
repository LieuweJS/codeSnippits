package networking;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class TicTacToeMain {

	public static void main(String[] args) {
    	Platform.startup(()->{
    		try {
    			Application tttDasboard = new DashboardTicTacToe();
    			tttDasboard.start(new Stage());
    		} catch (Exception e) {
    			e.printStackTrace();
    		};
    	});

	}
}
