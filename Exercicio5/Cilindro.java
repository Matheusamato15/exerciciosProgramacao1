package Exercicio5;

public class Cilindro
{
	private double raio;
	private double altura;
	
	public double getRaio() 
	{
		return raio;
	}
	
	public void setRaio(double raio) 
	{
		this.raio = raio;
	}
	
	public double getAltura() 
	{
		return altura;
	}
	
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	
	public double arealateral()
	{
		return 2 * 3.14159 * raio * altura;
	}
	
	public double areatotal()
	{
		return 2 * 3.1415 * raio * (altura+raio);
	}
	
	public double volume()
	{
		return 3.1415 * Math.pow(raio, 2) * altura;
	}
	
	
}
