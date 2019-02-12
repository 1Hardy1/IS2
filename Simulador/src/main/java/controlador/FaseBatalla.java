package controlador;
import java.util.Random;


public class FaseBatalla {

	public FaseBatalla() {
			

	 int[] soldier0=  {15, 80, 1};
	 int[] rider0=  {25, 10, 2};
	 int[] archer0=  {20, 90, 3};
	 int[] captain0=  {40, 140, 4};
	 
	 	int[]  equipo= new EquipoAzul().armarEquipoAzul();
		int[]  equipo2= new EquipoBlanco().armarEquipoBlanco();
	 
	 	int[] team1=  EquipoAzul.armarEquipoAzul();
		int[] team2=  EquipoBlanco.armarEquipoBlanco();
		
  
		//-----------------------------------------------    	

    	Random numAleatorio2 = new Random(); 
    	int d;
    	do {
    		d = numAleatorio2.nextInt(3-0+1)+1;	// Que unidad ataca primero
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
		 e = numAleatorio2.nextInt(3-0+1)+1;	// Que unidad ataca primero
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
    
		Random numAleatorio = new Random(); 
		int c = numAleatorio.nextInt(2-1+1)+1;	// Que equipo empieza
		
		if(c==1) {// el equipo 1 ataca primero "azul"
			if(d==0 && e==0) {
				
			}
			if(d==0 && e==1) {
				
			}
			if(d==0 && e==2) {
	
			}
			if(d==0 && e==3) {
	
			}
			if(d==1 && e==0) {		
				
			}
			if(d==1 && e==1) {		
				
			}
			if(d==1 && e==2) {		
	
			}
			if(d==1 && e==3) {		
	
			}
			if(d==2 && e==0) {	
				
			}
			if(d==2 && e==1) {	
				
			}
			if(d==2 && e==2) {	
	
			}
			if(d==2 && e==3) {	
	
			}
			if(d==3 && e==0) {	
				
			}
			if(d==3 && e==1) {	
				
			}
			if(d==3 && e==2) {	
	
			}
			if(d==3 && e==3) {	
	
			}
			
			
		}if(c==2) {// el equipo 2 ataca primero "blanco"
			if(e==0 && d==0) {
				
			}
			if(e==0 && d==1) {
				
			}
			if(e==0 && d==2) {
	
			}
			if(e==0 && d==3) {
	
			}
			if(e==1 && d==0) {		
				
			}
			if(e==1 && d==1) {		
				
			}
			if(e==1 && d==2) {		
	
			}
			if(e==1 && d==3) {		
	
			}
			if(e==2 && d==0) {	
				
			}
			if(e==2 && d==1) {	
				
			}
			if(e==2 && d==2) {	
	
			}
			if(e==2 && d==3) {	
	
			}
			if(e==3 && d==0) {	
				
			}
			if(e==3 && d==1) {	
				
			}
			if(e==3 && d==2) {	
	
			}
			if(e==3 && d==3) {	
	
			}
			
	
		}
	
	}
	}
