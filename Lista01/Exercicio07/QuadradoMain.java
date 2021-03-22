package Exercicio07;

public class QuadradoMain {

	public static void main(String[] args) {

		Quadrado q = new Quadrado();
		
		q.setTamanhoLado(100);
		System.out.println(q.valorLado());
		q.mudarTamanhoLado(150);
		System.out.println(q.valorLado());
		System.out.println(q.calcularArea());
		
		
	}

}
