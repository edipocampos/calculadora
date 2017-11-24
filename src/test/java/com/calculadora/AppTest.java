package com.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	float x;
	float y;
	
	protected void setUp() {
		x = 10;
		y = 2;	
	}	
	
	@Test
	public void testSoma() {				
		
		App cal = new App();
		
		float ResultadoEsperado = 12;
		float Resultado = cal.soma(x,y); 
		
		assertEquals(ResultadoEsperado, Resultado,0);
	}
	
	@Test
	public void testSubtrai() {
		
		App cal = new App();
		
		float ResultadoEsperado = 8;
		float Resultado = cal.subtrai(x,y);
					
		assertEquals(ResultadoEsperado, Resultado,0);		
	}
	
	@Test
	public void testDivide() {				
		
		App cal = new App();
		
		float ResultadoEsperado = 5;
		float Resultado = cal.divide(x,y);
		
		assertEquals(ResultadoEsperado, Resultado,0);		
	}
	
	@Test
	public void testMultiplica() {				
		
		App cal = new App();
		
		float ResultadoEsperado = 20;
		float Resultado = cal.multiplica(x,y);
		
		assertEquals(ResultadoEsperado, Resultado,0);		
	}

}