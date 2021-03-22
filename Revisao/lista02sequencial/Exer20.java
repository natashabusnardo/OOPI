package lista02;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o ano: ");
		int ano = entrada.nextInt();

		entrada.close();

		if (ano % 4 == 0)
			System.out.println("O ano é bissexto.");

		else
			System.out.println("Ano não bissexto.");

	}
}
