package testeo;

        import code.Calculadora;
        import org.junit.Test;
        import java.sql.Array;
        import static org.junit.Assert.*;

public class TesteoCalculadora 
{
    Calculadora calculadora = new Calculadora();


    @Test
    public void sumaTest(){
		
        assertEquals(calculadora.sumar(15, 15), 30);
    }
	
    @Test
    public void sumaTest2()
	{
        assertNotEqualsEquals(calculadora.sumar(2, -5), 0);
    }
	
    @Test
    public void restaTest()
	{
        assertEquals(calculadora.restar(2, 10), -8);
    }

    @Test
    public void restaTest2()
	{
        assertNotEquals(calculadora.restar(2, 2), 2);
    }

    @Test
    public void Multiplicacion1()
	{
        assertEquals(calculadora.multiplicacion(2, 2), 4);
    }

    @Test
    public void Multiplicacion2()
	{
        assertNotEquals(calculadora.multiplicacion(3, 2), 0);
    }

    @Test
    public void DivisionTest()
	
	{
        assertEquals(calculadora.Division(3, 3), 1);
    }

    @Test
    public void DivisionTest2()
	{
        assertNotEquals(calculadora.Division(100, 50), 5);
    }

    @Test
    public void DivisionTest3()
	{
        assertEquals(calculadora.Division(2, 0), 0);
    }
	
    @Test
    public void DivisionTest4()
	{
        assertEquals(calculadora.Division(0, 100), 0);
    }
	
    @Test (expected = ArithmeticException.class)
    public void divisionTestExcep()
    	{
    	calculator.dividir(2,0);
    	}
	
    @Test	
    public void  CuadraticaTest1()
	{
		assertEquals(String.valueOf(new float[][]{calculadora.FuncionCuadratica(1,-5,6)}),2,3);
	}	
	
    @Test	
    public void  CuadraticaTest2()
	{
		assertEquals(String.valueOf(new float[][]{calculadora.FuncionCuadratica(6,5,4)}),3,3);
	}	
	
    @Test
    public void cuadraticaTest3() 
	{
    		double result[] = {1, -5};
    		assertArrayEquals(calculadora.Funcioncuadratica(1, 4, (-5)), result, 0);
 	}
 
    @Test
    public void cuaTestM() 
    	{
  		double var = 991;
  		double var2 = 9;
		double result[] = {var, var2};
		assertArrayEquals(calculadora.Funcioncuadratica(1, 4, (-5)), result, 991);
	}
	
	
    @Test (expected = ArithmeticException.class)
    public void CuadraticaTestExcep()
    	{
    		double var = null;
  		double var2 = null;
		double result[] = {var, var2};
		assertArrayEquals(calculadora.Funcioncuadratica(0, 4, (-5)), result, null);
    	}
	// "a" no puede ser 0, de ser así dejaria de ser una función cuadrática

}



