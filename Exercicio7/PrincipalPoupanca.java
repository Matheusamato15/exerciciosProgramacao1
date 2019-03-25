package Exercicio7;

import java.util.Scanner;

public class PrincipalPoupanca {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		Scanner ler = new Scanner (System.in);
		
		cp.setNome("Matheus");
		cp.setNumeroConta(3201-8);
		cp.setNumeroAgencia(3601478-1);
		
		double saldo = cp.saldo;
		
		System.out.println("Cliente: "+cp.getNome());
		System.out.println("Número da conta: "+cp.getNumeroConta());
		System.out.println("Número agência: "+cp.getNumeroAgencia());
		System.out.printf("Saldo atual de: %.2f R$\n\n", saldo);
		
		System.out.print("Digite um valor para saque: ");
		cp.setSaque(ler.nextDouble());
		
		System.out.print("Digite um valor para depósito: ");
		cp.setDeposito(ler.nextDouble());
		
		System.out.printf("\nValor sacado: %.2f\n", cp.getSaque());
		System.out.printf("O valor depositado foi de: %.2f R$\n", cp.getDeposito());
		System.out.printf("Valor total depois do saque: %.2f R$\n", cp.saque());
		System.out.printf("O valor total depois do depósito: %.2f R$\n", cp.deposito());
		ler.close();
	}

}
