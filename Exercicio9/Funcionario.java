package Exercicio9;
//Classe modelo que representa funcionario
public class Funcionario {
	private String nome;
	private double salario;
	private int numeroFilhos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getNumeroFilhos() {
		return numeroFilhos;
	}
	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}
	
	public double desconto() {
		return numeroFilhos * 1250.25;
	}
	
	public double inss() {
		if(salario <= 2545.00) {
			return salario * 6/100;
		}
		else {
			return salario * 10/100;
		}
	}
}
