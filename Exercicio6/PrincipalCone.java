package Exercicio6;

import java.util.Scanner;

public class PrincipalCone {

	public static void main(String[] args) {
		Cone c = new Cone();
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Digite a altura desejada: ");
		c.setAltura(ler.nextDouble());
		
		System.out.print("Digite o raio desejado: ");
		c.setRaio(ler.nextDouble());
		
		System.out.printf("A geratriz é de: %.2f\n", c.geratriz());
		System.out.printf("A área lateral é de: %.2f\n", c.arealateral());
		System.out.printf("A área total é de: %.2f\n", c.areatotal());
		System.out.printf("O volume é de: %.2f\n", c.volume());
		
		
		ler.close();
	}

}
