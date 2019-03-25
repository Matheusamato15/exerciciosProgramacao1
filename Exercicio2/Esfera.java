package Exercicio2;

public class Esfera 
{
	private double raio;
	
	public double getRaio() 
	{
		return raio;
	}
	
	public void setRaio(double raio) throws Exception 
	{
		if(raio < 0)
		{
			Exception e = new Exception ("O raio é menor que zero");
			throw e;
		}
		
		this.raio = raio;
	} 
	
	public double area()
	{
		return 4 * 3.1415 * Math.pow(raio, 2);
	}
	
	public double volume()
	{
		return ((4/3) * 3.1415 * Math.pow(raio, 3));
	}

}
