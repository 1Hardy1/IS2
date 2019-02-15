package controlador;


import java.net.URL;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import uan.edu.co.Simulador.EquipoAzul;
import uan.edu.co.Simulador.EquipoBlanco;

public class BatallaControlador {
	
	@FXML
	private Button btnBatalla;

	@FXML
	private Button btnSalir;

	@FXML
	private Button btnSeguir;
	




	
	@FXML
	void clickbtnBatalla(ActionEvent event) {

		
		int[]  equipo= EquipoAzul.armarEquipoAzul();
		int[] equipo2= new EquipoBlanco().armarEquipoBlanco();
		
		
		
	}


	@FXML
	void clickbtnSeguir(ActionEvent event) {
		
	}
	
	@FXML
	void clickbtnSalir(ActionEvent event) {
		System.exit(0);	
	}
	
	public void comenzarBatalla (int[] equipo1, int[]equipo2) {


	}
}
