package Exercicio8;

public class Funcionario {
	private String nome;
	private String cpf;
	private int horasTrabalhadas;
	private double valorHoraTrabalho;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHoraTrabalho() {
		return valorHoraTrabalho;
	}
	public void setValorHoraTrabalho(double valorHoraTrabalho) {
		this.valorHoraTrabalho = valorHoraTrabalho;
	}
	
	public double salario() {
		return horasTrabalhadas * valorHoraTrabalho;
	}
}
