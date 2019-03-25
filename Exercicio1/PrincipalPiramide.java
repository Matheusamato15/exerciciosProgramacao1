package Exercicio1;

import java.util.Scanner;

public class PrincipalPiramide {
	public static void main (String[] args)
	{
		Piramide p = new Piramide();
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite uma altura:");
		p.setAltura(ler.nextFloat());
		
		System.out.println("Digite uma base: ");
		p.setBase(ler.nextInt());
		
		System.out.println("O volume da pirâmide é de: "+ p.volume());
		
		ler.close();
	}

}
