package Exercicio6;

public class Cone {
	
	public double raio;
	public double altura;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double geratriz() {
		return Math.sqrt((Math.pow(altura, 2)+ Math.pow(raio, 2)));
	}
	
	public double arealateral() {
		return 3.1415 * raio * geratriz();
	}
	
	public double areatotal() {
		return 3.1415 * raio * (geratriz() * raio);
	}
	
	public double volume() {
		return 1.0/3.0 * 3.1415 * (Math.pow(raio, 2)) * altura;
	}

}
