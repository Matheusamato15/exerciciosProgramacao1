package Exercicio3;

import java.util.Scanner;

public class PrincipalRetangulo 
{
	public static void main (String [] args)
	{
		Retangulo r = new Retangulo();
		Scanner ler = new Scanner (System.in);
		
		do
		{
			try 
			{
				System.out.println("Digite a largura: ");
				r.setLargura(ler.nextFloat());
			} 
			
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
		while(r.getLargura() <=0 );
		
		do
		{
			try 
			{
				System.out.println("Digite o comprimento: ");
				r.setComprimento(ler.nextFloat());
			}
			
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}

		}	
		while(r.getComprimento() <=0 );
		
		
		System.out.printf("A área do retângulo é de: %.2f\n", r.area());
		System.out.printf("O comprimento do retângulo é de: %.2f",r.perimetro());
		
		ler.close();
	}
}
