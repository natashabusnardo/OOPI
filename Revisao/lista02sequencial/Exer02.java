package lista02;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva um número: ");
		int num = entrada.nextInt();

		entrada.close();

		if (num > 0)
			System.out.println("Número positivo.");
		else if (num < 0)
			System.out.println("Número negativo");
		else
			System.out.println("Número 0.");

	}

}
