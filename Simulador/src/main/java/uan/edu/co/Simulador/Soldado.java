package uan.edu.co.Simulador;

public class Soldado {
	
	 private static int soldier;
	 private static int ataque;
	 private static int defensa;
	
	
	public Soldado() {
		
	}
	
	
	public int getDefensa() {
	return defensa;
	}

	public  void setSoldier(int soldier) {
		Soldado.soldier = soldier;
	}


	public  void setAtaque(int ataque) {
		Soldado.ataque = ataque;
	}


	public  void setDefensa(int defensa) {
		Soldado.defensa = defensa;
	}
	

	public  int getSoldier() {
		return soldier;
	}


	public  int getAtaque() {
		return ataque;
	}



}
