package controlador;

import java.util.Random;

public class EquipoAzul {
	
	public static int[] armarEquipoAzul( ) {
		
		Random numAleatorio = new Random();
		Random numAleatorio2 = new Random();
	    int a = numAleatorio.nextInt(10-5+1) + 5;
	    
	    int x =a-1;
	    int soldado=0;
	    int caballo=0;
	    int arquero=0;
	    int capitan=1;
	    int sold=0;
	  
	    do {
	    if(x!=0) { 
	    sold = numAleatorio2.nextInt(3-1+1) + 1;
	    if(sold == 1) {
	    	soldado=soldado+1;
	    }
	    if(sold== 2) {
	    	caballo=caballo+1;
	    }
	    if(sold== 3) {
	    	arquero=arquero+1;
	    }
	    	x=x-1;
	    }
	    }while(x>0);	
	    
	    int[] equipo1 = {soldado, caballo, arquero, capitan, a};
   
	    return equipo1;
	}
	
}

