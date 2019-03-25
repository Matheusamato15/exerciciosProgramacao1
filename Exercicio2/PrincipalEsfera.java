package Exercicio2;

import java.util.Scanner;

public class PrincipalEsfera 
{
	public static void main (String[] args)
	{
		Esfera e = new Esfera();
		Scanner ler = new Scanner (System.in);
		
		do
		{
			try 
			{
				System.out.println("Digite o raio para calcular: ");
				e.setRaio(ler.nextDouble());
			} 
			
			catch (Exception e2) 
			{
				System.out.println(e2.getMessage());
			}
		}
		while(e.getRaio() <= 0);
		
		
		System.out.printf("O área da esfera é de: %.2f", e.area());
		System.out.printf("O volume da esfera é de: %.2f ", e.volume());
		
		ler.close();
	}
	
}
