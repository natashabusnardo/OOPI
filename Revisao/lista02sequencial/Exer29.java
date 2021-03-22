package lista02;

import java.util.Scanner;

public class Exer29 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o número de litros vendidos: ");
		float litros = entrada.nextFloat();

		System.out.print("Insira o tipo de combustível: ");
		char tipo = entrada.next().charAt(0);

		entrada.close();

		double valor = 0;
		double valora = 1.9;
		double valorg = 2.5;

		if ((litros > 0) && ((tipo == 'A') || (tipo == 'G'))) {
			if (tipo == 'A') {
				if (litros <= 20) {
					valor = (litros * valora) - (litros * (valora * 0.03));
				} else {
					valor = (litros * valora) - (litros * (valora * 0.05));
				}
			} else if (tipo == 'G') {
				if (litros <= 20) {
					valor = (litros * valorg) - (litros * (valorg * 0.04));
				} else {
					valor = (litros * valorg) - (litros * (valorg * 0.06));
				}
			}
			System.out.println("Valor a ser pago: " + valor);
		} else
			System.out.println("Insira valores válidos.");

	}
}
