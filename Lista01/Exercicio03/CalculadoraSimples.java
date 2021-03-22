package Exercicio03;

public class CalculadoraSimples {

	private double um = 0;
	private double dois = 0;
	
	public double getUm() {
		return um;
	}
	public void setUm(double um) {
		this.um = um;
	}
	public double getDois() {
		return dois;
	}
	public void setDois(double dois) {
		this.dois = dois;
	}
	
	public double Adicao() {
		return((um+dois));
	}
	public double Subtracao() {
		return((um-dois));
	}
	public double Multiplicacao() {
		return((um*dois));
	}
	public double Divisao() {
		return((um/dois));
	}
	
}
