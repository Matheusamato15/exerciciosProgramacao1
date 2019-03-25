package Exercicio3;

public class Retangulo 
{
	private float comprimento;
	private float largura;
	
	public float getComprimento() 
	{
		return comprimento;
	}
	
	public void setComprimento(float comprimento) throws Exception 
	{
		if(comprimento < 0)
		{
			Exception e = new Exception("O comprimento é menor que zero");
			throw e;
		}
		this.comprimento = comprimento;
	}
		
	
	public float getLargura() 
	{
		return largura;
	}
	
	public void setLargura(float largura) throws Exception 
	{
		if(largura < 0)
		{
			Exception e2 = new Exception("A largura é menor que zero");
			throw e2;
		}
	
		this.largura = largura;
	}
	
	public float area()
	{
		return largura * comprimento;
	}
	
	public float perimetro()
	{
		return largura *2 + comprimento * 2;
	}
}
