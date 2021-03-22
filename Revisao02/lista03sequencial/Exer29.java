package lista03;

import java.util.Scanner;

public class Exer29 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva o número para realizar a tabuada");
		int numero = entrada.nextInt();

		System.out.println("Escreva o número de início da sua tabuada.");
		int inicio = entrada.nextInt();

		System.out.println("Escreva o número de fim da sua tabuada.");
		int fim = entrada.nextInt();

		entrada.close();

		if (fim > inicio) {
			System.out.println("Escreva um início maior que o fim.");
		} else {
			for (int i = inicio; i <= fim; i++) {
				System.out.println(numero + " x " + i + " = " + numero * i);
			}
		}
	}
}
