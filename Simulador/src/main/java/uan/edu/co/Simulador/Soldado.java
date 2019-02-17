package uan.edu.co.Simulador;

public class Soldado {
	
	 static int soldier;
	 static int ataque;
	 static int defensa;
	
	
	public Soldado() {
		
	}

	public static int getSoldier() {
		return soldier;
	}


	public static int getAtaque() {
		return ataque;
	}

	public static int getDefensa() {
		return defensa;
	}

	public static void setSoldier(int soldier) {
		Soldado.soldier = soldier;
	}


	public static void setAtaque(int ataque) {
		Soldado.ataque = ataque;
	}


	public static void setDefensa(int defensa) {
		Soldado.defensa = defensa;
	}



}
