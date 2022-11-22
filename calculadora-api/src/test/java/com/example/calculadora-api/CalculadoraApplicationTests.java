package com.example.calculadora-api;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeAll;


@SpringBootTest

class CalculadoraApplicationTests 
{
	@Test
	void contextLoads() 
	{}
	
	public Calculadora calculadora;
	
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
	public void suma3()
	{
		assertEquals(Calculadora.suma((-2),(-3)),(-5));
	}
	
	@Test
	public void resta()
	{
		assertEquals(Calculadora.resta(3,3),0);
	}
	
	@Test 
	public void resta2()
	{
		assertEquals(Calculadora.resta((-6),(-6)),0);
	}
	
	@Test 
	public void resta3()
	{
		assertNotEquals(Calculadora.resta(2,3),5);
	}
	
	@Test
	public void multiplicacion()
	{
		assertEquals(Calculadora.multiplicacion(6,6),36);
	}
	
	@Test 
	public void multiplicacion2()
	{
		assertEquals(Calculadora.multiplicacion((-1),(-11)),23);
	}
	
	@Test 
	public void multiplicacion3()
	{
		assertNotEquals(Calculadora.multiplicacion(12,32),0);
	}
	
	@Test 
	public void multiplicacion4()
	{
		assertNotEquals(Calculadora.multiplicacion((-12),32),32);
	}
	
	@Test
	public void division()
	{
		assertEquals(Calculadora.division(3,4),0.75);
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
	
	@Test
	public void cuadratica()
	{
		double result1[] = {-1 , -1};
		assertArrayEquals(Calculadora.FuncionCuadratica(1,2,1),result1,0);
	}


	@Test
	public void Cuadratica2()
	{
		double result2[] = { 1 , -5};
		assertArrayEquals(Calculadora.FuncionCuadratica(1,4,(-5)),result2,0);
	}

	@Test
	public void Cuadratica3()
	{
		assertThrows(ArithmeticException.class,() -> {Calculadora.FuncionCuadratica(0,778,334);});
	}

	@Test
	public void Cuadratica4()
	{
		assertThrows(ArithmeticException.class,() -> {Calculadora.FuncionCuadratica(0, 3,5);});
	}
}
