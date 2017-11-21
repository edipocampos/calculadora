package br.com.alfa.exemplo_alfa;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    
	float x;
	float y;
	
	protected void setUp() {
		x = 10;
		y = 2;	
	}	
		
	public void testSoma() {				
		
		App cal = new App();
		
		float ResultadoEsperado = 12;
		float Resultado = cal.soma(10,2); 
		
		assertEquals(ResultadoEsperado, Resultado,0);
	}
	
	public void testSubtrai() {
		
		App cal = new App();
		
		float ResultadoEsperado = 8;
		float Resultado = cal.subtrai(x,y);
					
		assertEquals(ResultadoEsperado, Resultado,0);		
	}
		
	public void testDivide() {				
		
		App cal = new App();
		
		float ResultadoEsperado = 5;
		float Resultado = cal.divide(x,y);
		
		assertEquals(ResultadoEsperado, Resultado,0);		
	}
		
	public void testMultiplica() {				
		
		App cal = new App();
		
		float ResultadoEsperado = 20;
		float Resultado = cal.multiplica(x,y);
		
		assertEquals(ResultadoEsperado, Resultado,0);		
	}

}