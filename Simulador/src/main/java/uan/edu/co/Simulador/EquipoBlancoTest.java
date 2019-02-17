package uan.edu.co.Simulador;

import static org.junit.Assert.*;

import org.junit.Test;



public class EquipoBlancoTest {
	
	boolean comprobar = false;
	int armarNoEquipo[] = EquipoBlanco.armarEquipoBlanco();

	@Test
	public void test() {
		
		for(int i=0; i<1; i++)
		{
			if(armarNoEquipo[i] > 5 || armarNoEquipo[i] <10)
			{
				comprobar = true;
				System.out.println("correcto");
			}
			else
			{
				fail("Not yet implemented");
			}
		}
		
	}

}
