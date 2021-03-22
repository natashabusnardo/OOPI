package Exercicio07;

public class Quadrado {

	private double tamanhoLado = 0;

	public double getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(double tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public void mudarTamanhoLado(double novoTamanho) {
		tamanhoLado = novoTamanho;
	}
	
	public double valorLado() {
		return tamanhoLado;
	}
	
	public double calcularArea(){
		double area = tamanhoLado * tamanhoLado;
		return area;
	}
	
}
