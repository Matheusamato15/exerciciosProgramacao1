package Exercicio7;

public class ContaPoupanca {
	private String nome;
	private int numeroConta;
	private int numeroAgencia;
	private double saque;
	private double deposito;
	public double saldo=1000.00;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public double saque() {
		return saldo - saque;
	}
	
	public double deposito() {
		return saque() + deposito;
	}
}
