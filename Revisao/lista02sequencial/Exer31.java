package lista02;

import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o tipo de carne desejada: ");
		char carne = entrada.next().charAt(0);

		System.out.print("Insira a quantidade de carne em kg: ");
		float qtd = entrada.nextFloat();

		System.out.print("Possui cartões tabajara? ");
		char cartao = entrada.next().charAt(0);
		entrada.close();

		double valorfd = 4.9;
		double valorfd2 = 5.8;
		double valora = 5.9;
		double valora2 = 6.8;
		double valorp = 6.9;
		double valorp2 = 7.8;
		double total = 0.0;

		if (((carne == 'F') || (carne == 'A') || (carne == 'P')) && (qtd > 0)) {

			if (qtd < 5) {
				if (carne == 'F')
					total = (qtd * valorfd);
				else if (carne == 'A')
					total = (qtd * valora);
				else
					total = (qtd * valorp);
			} else {
				if (carne == 'F')
					total = (qtd * valorfd2);
				else if (carne == 'A')
					total = (qtd * valora2);
				else
					total = (qtd * valorp2);
			}

			if (cartao == 'S')
				total = total - (total * 0.05);

			System.out.println("Valor a ser pago: " + total);
		} else
			System.out.println("Insira valores válidos.");

	}
}
