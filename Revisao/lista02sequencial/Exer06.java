package lista02;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o número: ");
		int num = entrada.nextInt();

		entrada.close();

		if (num == 0)
			System.out.println("Número zero.");

		else if (num % 2 == 0)
			System.out.println(num + 1);

		else
			System.out.println(num + 1);
	}
}
