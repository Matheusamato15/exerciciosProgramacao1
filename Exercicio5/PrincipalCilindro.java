package Exercicio5;

import java.util.Scanner;

public class PrincipalCilindro {

	public static void main(String[] args) 
	{
		Cilindro c = new Cilindro();
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Digite o raio desejado: ");
		c.setRaio(ler.nextDouble());
		
		System.out.print("Digite a altura desejada: ");
		c.setAltura(ler.nextDouble());
		
		System.out.printf("Área lateral = %.2f\n", c.arealateral());
		System.out.printf("Área total = %.2f\n", c.areatotal());
		System.out.printf("Volume = %.2f\n", c.volume());
		
		ler.close();
	}

}
