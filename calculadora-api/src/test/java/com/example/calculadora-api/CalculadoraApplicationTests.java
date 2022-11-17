package com.example.calculadora-api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class CalculadoraApplicationTests 
{
	public class testCalculadora
	{
		private Calculadora calculadora;
	}
	
@BeforeEach

	public void objeto()
	{
		Calculadora calculadora = new Calculadora();
	}
	
	@Test
	public void suma() 
	{
		assertEquals(Calculadora.suma(5,5),10);
	}
	
	@Test
	public void suma2()
	{
		assertNotEquals(Calculadora.suma(2,3),1);
	}
	
	@Test
	public void resta()
	{
		assertEquals(Calculadora.resta(3,3),0);
	}
	
	@Test 
	public void resta2()
	{
		assertNotEquals(Calculadora.resta(6,1),4);
	}
	
	@Test
	public void multiplicacion()
	{
		assertEquals(Calculadora.multiplicacion(6,6),36);
	}
	
	@Test public void multiplicacion2()
	{
		assertNotEquals(Calculadora.multiplicacion(1,11),23);
	}
	
	@Test
	public void division()
	{
		assertEquals(Calculadora.division(2,2),1);
		assertEquals(Calculadora.division(-2,2),-1);
		assertEquals(Calculadora.division(-2,-2),1);
	}
	
	@Test 
	public void division2()
	{
		assertNotEquals(Calculadora.division(2,2),9);
	}
		
	@Test 
	public void divisionException()
	{
		Assertions.assertThrows(ArithmeticException.class,() -> {Calculadora.division(1,0);});
	}
}
