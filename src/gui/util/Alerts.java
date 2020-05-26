package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



public class Alerts {
	public static void showAlert(String titulo, String header, String context, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(titulo);
		alert.setHeaderText(header);
		alert.setContentText(context);
		alert.show();
	}
}
