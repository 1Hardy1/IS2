package controlador;

import java.util.Random;

public class EquipoBlanco {
	
	public static int[] armarEquipoBlanco(int s) {
		
		Random numAleatorio = new Random();
	    int b = numAleatorio.nextInt(10-5+1) + 5;
		
	    int x =b-1;
	    int soldado=0;
	    int caballo=0;
	    int arquero=0;
	    int capitan=1;
	    int sold=0;
	    
	    do {
	    if(x!=0) { 
	    sold = numAleatorio.nextInt(3-1+1) + 1;
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
	    
	    int[] equipo2 = {soldado, caballo, arquero, capitan};
	    
	    return equipo2;
	}

}
