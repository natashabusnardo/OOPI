package lista03;

import java.util.Scanner;

public class Exer29 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva o n�mero para realizar a tabuada");
		int numero = entrada.nextInt();

		System.out.println("Escreva o n�mero de in�cio da sua tabuada.");
		int inicio = entrada.nextInt();

		System.out.println("Escreva o n�mero de fim da sua tabuada.");
		int fim = entrada.nextInt();

		entrada.close();

		if (fim > inicio) {
			System.out.println("Escreva um in�cio maior que o fim.");
		} else {
			for (int i = inicio; i <= fim; i++) {
				System.out.println(numero + " x " + i + " = " + numero * i);
			}
		}
	}
}
