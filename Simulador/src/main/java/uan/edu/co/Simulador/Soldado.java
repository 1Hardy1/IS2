package uan.edu.co.Simulador;

public class Soldado {
	
	 static int Soldier;
	 static int ataque;
	 static int defenza;
	
	public Soldado() {
		
	}
	
	
	public static int getSoldier() {
		return Soldier;
	}


	public static void setSoldier(int soldier) {
		Soldier = soldier;
	}


	public static int getAtaque() {
		return ataque;
	}


	public static void setAtaque(int ataque) {
		Soldado.ataque = ataque;
	}


	public static int getDefenza() {
		return defenza;
	}


	public static void setDefenza(int defenza) {
		Soldado.defenza = defenza;
	}


	public static int atacar() {
		return ataque;
	}
	public static int recibirDaño() {
		return defenza;
	}
}
