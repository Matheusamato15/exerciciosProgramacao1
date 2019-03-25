package Exercicio4;

public class Paralelepipedo 
{
	private float altura;
	private float largura;
	private float comprimento;
	
	public float getAltura() 
	{
		return altura;
	}
	
	public void setAltura(float altura) 
	{
		this.altura = altura;
	}
	
	public float getLargura() 
	{
		return largura;
	}
	
	public void setLargura(float largura) 
	{
		this.largura = largura;
	}
	
	public float getComprimento() 
	{
		return comprimento;
	}
	
	public void setComprimento(float comprimento) 
	{
		this.comprimento = comprimento;
	}
	
	public float volume()
	{
		return  altura * comprimento * largura;
	}
	
	public float area()
	{
		return 2 * (altura*largura + altura * comprimento + largura * comprimento);
	}
	
}
