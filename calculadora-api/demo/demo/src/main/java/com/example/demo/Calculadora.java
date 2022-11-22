package com.example.calculadora-api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

public class Calculadora 
{

        @GetMapping("/hola")
        String ruta()
	{
        return "Hola mundo";
    	}
	
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
	
	public static float[] FuncionCuadratica(float a, float b, float c)
	{       
        float b2 = b*b;
        float dentroraiz = b2 - (4*a*c);
        float raiz = (float) Math.sqrt(dentroraiz);
        float cuenta = (float)raiz;
        float verificacion =cuenta;
            if (verificacion % 2 ==0)
            {
                float primero = ((-b + raiz)/2*a);
                float segundo = ((-b  - raiz)/2*a);

                float [] result = {primero, segundo};

                return  result;
            }
     
	 throw new ArithmeticException("a no puede ser 0");

         }
	
}
