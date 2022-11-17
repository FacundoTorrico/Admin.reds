package com.example.calculadora-api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Calculadora 
{

	@GetMapping("/suma/{num1}/{num2}")
	public static int suma(@PathVariable int num1, @PathVariable int num2) 
	{
		return num1 + num2;
	}

	@GetMapping("/resta/{num1}/{num2}")
	public static int resta(@PathVariable int num1, @PathVariable int num2) 
	{
		return num1 - num2;
	}

	@GetMapping("/multiplication/{num1}/{num2}")
	public static int multiplicacion(@PathVariable int num1, @PathVariable int num2) 
	{
		return num1 * num2;
	}

	@GetMapping("/division/{num1}/{num2}")
	public static int division(@PathVariable int num1, @PathVariable int num2) 
	{
		if (num2 == 0) 
		{
			throw new ArithmeticException("No se puede dividir por 0");
		}
		return num1 / num2;
	}
}