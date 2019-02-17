package controlador;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquipoAzulTest {
	
	boolean compruebe = false;
	int cantidad_del_equipo[] = EquipoAzul.armarEquipoAzul();

	@Test
	public void armarEquipoTest() {
		
		for(int i =0; i<1; i++)
		{
			if(cantidad_del_equipo[i] >5 || cantidad_del_equipo[i] < 10)
			{
				compruebe = true;
				System.out.println("bien");
			}
			else
			{
				fail("Not yet implemented");
			}
		}
		
		
	}

}
