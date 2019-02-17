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
import uan.edu.co.Simulador.FaseBatalla;
import uan.edu.co.Simulador.Infanteria;
import uan.edu.co.Simulador.Soldado;

public class BatallaControlador {
	
	@FXML
	private Button btnBatalla;

	@FXML
	private Button btnSalir;

	@FXML
	private Button btnEspecialBlanco;
	
	@FXML
	private Button btnEspecialAzul;
	
	@FXML
	private ImageView pEquipoAzul;
	
	@FXML
	private ImageView pEquipoBlanco;
	
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

	private Soldado[] combattants;

	
	

	@FXML
	void clickbtnBatalla(ActionEvent event) throws InterruptedException {
		
		

		FaseBatalla peleadores= new FaseBatalla();
		peleadores.combatir();
		//-----------
		combattants=peleadores.combatir();
		
	
		
		int tipo1= (int) combattants[0].getSoldier();
		int tipo2= (int) combattants[1].getSoldier();

		
		
		if(tipo1==0) {// 0 hace referencia al integrante del equipo azul, y 1 hace referencia al integrante del equipo blanco
			pEquipoAzul.setImage(new Image("/vista/soldado.jpg"));
		}
		
		else if(tipo1==1) {
			pEquipoAzul.setImage(new Image("/vista/caballo.jpg"));
		}
		else if(tipo1==2) {
			pEquipoAzul.setImage(new Image("/vista/arquero.jpg"));
		}
		else if(tipo1==3) {
			pEquipoAzul.setImage(new Image("/vista/capitan.jpg"));
		}
		else if(tipo2==0) {
			pEquipoBlanco.setImage(new Image("/vista/soldado2.png"));
		}
		else if(tipo2==1) {
			pEquipoBlanco.setImage(new Image("/vista/caballo2.png"));
		}
		else if(tipo2==2) {
			pEquipoBlanco.setImage(new Image("/vista/arquero2.jpg"));
		}
		else if(tipo2==3) {
			pEquipoBlanco.setImage(new Image("/vista/capitan2.jpg"));
		}

	}



	
	@FXML
	void clickBtnEspecialAzul(ActionEvent event) {
		
	}
	
	@FXML
	void clickBtnEspecialBlanco(ActionEvent event) {
		
	}
	
	@FXML
	void clickbtnSalir(ActionEvent event) {
		System.exit(0);	
	}
	

}
