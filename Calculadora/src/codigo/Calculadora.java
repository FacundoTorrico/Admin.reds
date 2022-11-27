package codigo;

public class Calculadora {

    public Calculadora()
    {

    }

	public int sumar(int num1, int num2) 
	{
        return  num1 + num2;
    }

    public int restar(int num1, int num2) 
	{
        return num1 - num2;
    }
    
	public int multiplicacion(int num1, int num2) 
	{

        return num1*num2;
    }
    
	public int division(int num1, int num2) 
	{
        int resultado = 0;
        if (num2 != 0) 
		{
            resultado = num1 / num2;
        }
        return resultado;
    }
	   
	    public double[] FuncionCuadratica(double a, double b, double c) 
	    {
        	double x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        	double x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        	double[] results = {x1, x2};
        	return results;
    	    }
	//cambio la cuadrática porque la otra tiene un final al que nunca llegará

    }
	
    
}
