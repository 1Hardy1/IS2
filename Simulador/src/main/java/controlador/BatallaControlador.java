package controlador;


import java.net.URL;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
	private ImageView pEquipoAzul;
	
	@FXML
	private ImageView pEquipoBlano;
	
	@FXML
	private Text ataqueAzul;
	
	@FXML
	private Text resistenciaAzul;
	
	@FXML
	private Text tipoAzul;
	
	@FXML
	private Text teamAzul;
	
	@FXML
	private Text ataqueBlanco;
	
	@FXML
	private Text resistenciaBlanco;
	
	@FXML
	private Text tipoBlanco;
	
	@FXML
	private Text teamBlanco;




	
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
	

}
