package uan.edu.co.Simulador;
import java.util.Random;


public class FaseBatalla {
	
	private int atackBl;
	private int defenceBl;
	private int typeBl;
	private int specialBl;
	private int atackWh;
	private int defenceWh; 
	private int typeWh;
	private int specialWh;
	private int d;
	private int e;
	private Soldado soldat1= new Soldado();
	private Soldado soldat2= new Soldado();

	public  Soldado[] combatir() throws InterruptedException {
			
		Soldado[] combatientes=null;
	 
	 	int[] team1=  EquipoAzul.armarEquipoAzul();
		int[] team2=  EquipoBlanco.armarEquipoBlanco();
		

  
		//-----------------------------------------------   
		//Tipo 1 es infanteria, tipo 2 Caballero, tipo 3 Arquero, tipo 4 Capitan
		
		//-----------------------------------------------
		
	
			
			
			//------------------------------------

    	Random numAleatorio2 = new Random(); 
    	
    	do {
    	
    			 d = numAleatorio2.nextInt(3-0+1)+1;	// Que unidad sube a combate del equipo azul
    		
    	
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
    	
    	do {
 
    			 e = numAleatorio2.nextInt(3-0+1)+1;	// Que unidad sube a combate del equipo blanco
    		
		
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
					Soldado soldadoAzul= new Infanteria();
					atackBl= soldadoAzul.getAtaque();
					defenceBl=soldadoAzul.getDefensa();
					typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado
					soldadoAzul=  soldat1;
					System.out.print(soldadoAzul.getAtaque());
					

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
					
				Soldado soldadoAzul= new Caballero();
				atackBl= soldadoAzul.getAtaque();
				defenceBl=soldadoAzul.getDefensa();
				typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado
				soldadoAzul=  soldat1;
				System.out.print(soldadoAzul.getAtaque());
				
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
				Soldado soldadoAzul= new Arquero();
				atackBl= soldadoAzul.getAtaque();
				defenceBl=soldadoAzul.getDefensa();
				typeBl=soldadoAzul.getSoldier(); //soldier hace referencia al tipo de soldado
				soldadoAzul=  soldat1;
				System.out.print(soldadoAzul.getAtaque());
				
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
				System.out.print(soldadoAzul.getAtaque());
				
				
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
				Soldado soldadoBlanco= new Infanteria();
				atackWh= soldadoBlanco.getAtaque();
				defenceWh=soldadoBlanco.getDefensa();
				typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
				soldadoBlanco=  soldat2;
				System.out.print(soldadoBlanco.getAtaque());
				
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
				Soldado soldadoBlanco= new Caballero();
				atackWh= soldadoBlanco.getAtaque();
				defenceWh=soldadoBlanco.getDefensa();
				typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
				soldadoBlanco=  soldat2;
				System.out.print(soldadoBlanco.getAtaque());
				
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
					Soldado soldadoBlanco= new Arquero();
					atackWh= soldadoBlanco.getAtaque();
					defenceWh=soldadoBlanco.getDefensa();
					typeWh=soldadoBlanco.getSoldier(); //soldier hace referencia al tipo de soldado
					soldadoBlanco=  soldat2;
					System.out.print(soldadoBlanco.getAtaque());
					
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
					System.out.print(soldadoBlanco.getAtaque());
				}
			}
			}	
			
		
		//------------------------------------------------------------------------------

			Random numAleatorio = new Random(); 
			int c = numAleatorio.nextInt(2-1+1)+1;	// Que equipo empieza
			
		 if(c==1) {
			 
			 do {
				 
				 Thread.sleep(2000);
				 
			
				 defenceWh=defenceWh-atackBl;
				 //----------------------------
				 
				 Thread.sleep(2000);
				 
				 defenceBl=defenceBl-atackBl;
				 
				 Thread.sleep(2000);
			
				 
			 }while(defenceBl>0 && defenceWh>0);
		
			 
		 }if(c==2) {
			 
			 do {
				 
				 Thread.sleep(2000);
	
				 defenceBl=defenceBl-atackBl;
				 //---------------------------
				 
				 Thread.sleep(2000);
				 
				 defenceWh=defenceWh-atackBl;
				 
				 Thread.sleep(2000);
				
				 
			 }while(defenceBl>0 && defenceWh>0);
			 
		 }
		
	
	//------------------------------------------------------------------------------------
		
		
		combatientes[0]=soldat1;
		combatientes[1]=soldat2;
		
		return combatientes;
		
		
		}

	
	}
	

