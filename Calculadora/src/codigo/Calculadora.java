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
