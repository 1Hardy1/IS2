package uan.edu.co.Simulador;
import java.util.Random;


public class FaseBatalla {
	
	public FaseBatalla() {
		
	}

	public  void combatir(int atackBl, int defenceBl, int typeBl, int specialBl, int atackWh, int defenceWh, int typeWh, int specialWh) {
			
	 
	 
	 	int[] team1=  EquipoAzul.armarEquipoAzul();
		int[] team2=  EquipoBlanco.armarEquipoBlanco();
		
  
		//-----------------------------------------------   
		//Tipo 1 es infanteria, tipo 2 Caballero, tipo 3 Arquero, tipo 4 Capitan
		
		//-----------------------------------------------
		
		do {

    	Random numAleatorio2 = new Random(); 
    	int d;
    	do {
    		d = numAleatorio2.nextInt(3-0+1)+1;	// Que unidad sube a combate
    	}while(team1[d]==0);

		if(d==0) {
			team1[0]=team1[0]-1;
		}if(d==1) {
			team1[1]=team1[1]-1;
		}if(d==2) {
			team1[2]=team1[2]-1;
		}if(d==3) {
			team1[3]=team1[3]-1;
		}
    	
	   //---------------------------------------------------------
	 
	    
    	
    	Random numAleatorio3 = new Random(); 
    	int e;
    	do {
		 e = numAleatorio2.nextInt(3-0+1)+1;	// Que unidad sube a combate
    	}while(team2[e]==0);
    	
    	if(e==0) {
			team2[0]=team2[0]-1;
		}if(e==1) {
			team2[1]=team2[1]-1;
		}if(e==2) {
			team2[2]=team2[2]-1;
		}if(e==3) {
			team2[3]=team2[3]-1;
		}

        //--------------------------------------
    
		
		
				
			if(d==0) {	
				if(team1[0]==0 && team1[1]==0 && team1[2]==0 && team1[3]==0) {
					// PERDIO EL EQUIPO AZUL
					
				}else {

				if(team1[0]==0) {
					do {
						d = numAleatorio2.nextInt(3-0+1)+1;
					}while(d==0);
				}else {
					Infanteria soldadoAzul= new Infanteria();
					atackBl= soldadoAzul.getAtaque();
					defenceBl=soldadoAzul.getDefensa();
					typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado

				}
			}
			}
			
			if(d==1 ) {		
				if(team1[0]==0 && team1[1]==0 && team1[2]==0 && team1[3]==0) {
					// PERDIO EL EQUIPO AZUL
					
				}else {
				if(team1[1]==0) {
					do {
						d = numAleatorio2.nextInt(3-0+1)+1;
					}while(d==1);
				}else {
				Caballero soldadoAzul= new Caballero();
				atackBl= soldadoAzul.getAtaque();
				defenceBl=soldadoAzul.getDefensa();
				typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado
				}
			}
			}
			if(d==2) {	
				if(team1[0]==0 && team1[1]==0 && team1[2]==0 && team1[3]==0) {
					// PERDIO EL EQUIPO AZUL
					
				}else {
				if(team1[2]==0) {
					do {
						d = numAleatorio2.nextInt(3-0+1)+1;
					}while(d==2);
				}else {
				Arquero soldadoAzul= new Arquero();
				atackBl= soldadoAzul.getAtaque();
				defenceBl=soldadoAzul.getDefensa();
				typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado
				}
			}
			}
			if(d==3) {	
				if(team1[0]==0 && team1[1]==0 && team1[2]==0 && team1[3]==0) {
					// PERDIO EL EQUIPO AZUL
					
				}else {
				if(team1[3]==0) {
					do {
						d = numAleatorio2.nextInt(3-0+1)+1;
					}while(d==3);
				}else {
				Capitan soldadoAzul= new Capitan();
				atackBl= soldadoAzul.getAtaque();
				defenceBl=soldadoAzul.getDefensa();
				typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado
				specialBl=soldadoAzul.getAtaqueEspecial();
				
			}
			}		
			}
			
		
		
			if(e==0) {
				if(team2[0]==0 && team2[1]==0 && team2[2]==0 && team2[3]==0) {
					// PERDIO EL EQUIPO BLANCO
					
				}else {
				if(team2[0]==0) {
					do {
						e = numAleatorio2.nextInt(3-0+1)+1;
					}while(e==0);
				}else {
				Infanteria soldadoBlanco= new Infanteria();
				atackWh= soldadoBlanco.getAtaque();
				defenceWh=soldadoBlanco.getDefensa();
				typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
				}
			}
			}
	
			if(e==1) {	
				if(team2[0]==0 && team2[1]==0 && team2[2]==0 && team2[3]==0) {
					// PERDIO EL EQUIPO BLANCO
					
				}else {
				if(team2[1]==0) {
					do {
						e = numAleatorio2.nextInt(3-0+1)+1;
					}while(e==1);
				}else {
				Caballero soldadoBlanco= new Caballero();
				atackWh= soldadoBlanco.getAtaque();
				defenceWh=soldadoBlanco.getDefensa();
				typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
			}
			}
			}
			if(e==2) {	
				if(team2[0]==0 && team2[1]==0 && team2[2]==0 && team2[3]==0) {
					// PERDIO EL EQUIPO BLANCO
					
				}else {
				if(team2[2]==0) {
					do {
						e = numAleatorio2.nextInt(3-0+1)+1;
					}while(e==2);
				}else {
					Arquero soldadoBlanco= new Arquero();
					atackWh= soldadoBlanco.getAtaque();
					defenceWh=soldadoBlanco.getDefensa();
					typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
			}
			}	
			}
		
			if(e==3) {	
				if(team2[0]==0 && team2[1]==0 && team2[2]==0 && team2[3]==0) {
					// PERDIO EL EQUIPO BLANCO
					
				}else {
				if(team2[3]==0) {
					do {
						e = numAleatorio2.nextInt(3-0+1)+1;
					}while(e==3);
				}else {
					Capitan soldadoBlanco= new Capitan();
					atackWh= soldadoBlanco.getAtaque();
					defenceWh=soldadoBlanco.getDefensa();
					typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
					specialWh=soldadoBlanco.getAtaqueEspecial();
				}
			}
			}	
			
		
		//------------------------------------------------------------------------------

			Random numAleatorio = new Random(); 
			int c = numAleatorio.nextInt(2-1+1)+1;	// Que equipo empieza
			
		 if(c==1) {
			 
			 do {
				 defenceWh=defenceWh-atackBl;
				 //----------------------------
				 
				 defenceBl=defenceBl-atackBl;
				 
			 }while(defenceBl>0 && defenceWh>0);
		
			 
		 }if(c==2) {
			 
			 do {
				 defenceBl=defenceBl-atackBl;
				 //---------------------------
				 
				 defenceWh=defenceWh-atackBl;
				 
			 }while(defenceBl>0 && defenceWh>0);
			 
		 }
		
		}while(team1[0]==0 && team1[1]==0 && team1[2]==0 && team1[3]==0 && team2[0]==0 && team2[1]==0 && team2[2]==0 && team2[3]==0);		
	//------------------------------------------------------------------------------------
		
		
		}
	
	
	
	}
	

