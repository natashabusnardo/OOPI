package lista02;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira a quantidade de morangos em kg: ");
		float morangos = entrada.nextFloat();

		System.out.print("Insira a quantidade de maçãs em kg: ");
		float macas = entrada.nextFloat();

		entrada.close();

		double valormm = 0.0;
		double valorm = 0.0;
		double valormo1 = 2.5;
		double valormo2 = 2.2;
		double valorma1 = 1.8;
		double valorma2 = 1.5;
		double total = 0.0;

		if ((morangos >= 0) || (macas >= 0)) {
			if (morangos < 5)
				valormm = (morangos * valormo1);

			else
				valormm = (morangos * valormo2);

			if (macas < 5)
				valorm = (macas * valorma1);

			else
				valorm = (macas * valorma2);

			if ((morangos + macas > 8) || ((valorm + valormm) > 25)) {
				total = (valorm + valormm) - ((valorm + valormm) * 0.1);
			} else {
				total = (valorm + valormm);
			}

			System.out.println("Valor a ser pago: " + total);
		} else
			System.out.println("Insira valores válidos.");

	}
}
