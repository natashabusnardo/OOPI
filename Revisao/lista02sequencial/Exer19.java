package lista02;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva o valor de a: ");
		int a = entrada.nextInt();

		if (a != 0) {

			System.out.print("Escreva o valor de b: ");
			int b = entrada.nextInt();

			System.out.print("Escreva o valor de c: ");
			int c = entrada.nextInt();

			entrada.close();

			double delta = ((b * b) - 4 * a * c);
			double bhas1 = 0.0;
			double bhas2 = 0.0;

			if (delta > 0) {
				bhas1 = (((-b) + (delta * 0.5)) / (2 * a));
				bhas2 = (((-b) - (delta * 0.5)) / (2 * a));
				System.out.printf("Ra�z 1: " + bhas1);
				System.out.printf("Ra�z 2: " + bhas2);
			} else if (delta == 0) {
				bhas1 = (((-b) + (delta * 0.5)) / (2 * a));
				System.out.printf("Ra�z 1: " + bhas1);
			} else
				System.out.println("A equa��o n�o possui ra�zes reais.");

		} else {
			System.out.println("N�o � uma fun��o de segundo grau.");
		}

	}

}
