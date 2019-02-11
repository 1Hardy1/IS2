package controlador;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class MenuControlador {
	
	@FXML
	private Button btnComenzar;

	@FXML
	private Button btnSalir;

	
	@FXML
	void clickbtnComenzar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnComenzar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/vista/batalla.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}

	@FXML
	void clickbtnSalir(ActionEvent event) {
		System.exit(0);	
	}
	


}
