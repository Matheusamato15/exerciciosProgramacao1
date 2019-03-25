package Exercicio4;

import java.util.Scanner;

public class PrincipalParalelepipedo 
{

	public static void main(String[] args) 
	{
		Paralelepipedo p = new Paralelepipedo();
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Digite a altura desejada: ");
		p.setAltura(ler.nextFloat());
		
		System.out.print("Digite a largura desejada: ");
		p.setLargura(ler.nextFloat());
		
		System.out.print("Digite o comprimento desejado: ");
		p.setComprimento(ler.nextFloat());
		
		
		ler.close();
	}

}
