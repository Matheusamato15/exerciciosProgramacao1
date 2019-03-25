package Exercicio1;

public class Piramide {
	
	private float altura;
	private int base;
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	public float volume()
	{
		return base * altura * 1/3;
	}
}
