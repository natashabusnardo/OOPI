package lista02;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva um n�mero: ");
		int num1 = entrada.nextInt();

		System.out.print("Escreva um n�mero: ");
		int num2 = entrada.nextInt();

		entrada.close();

		if (num1 > num2)
			System.out.println("\nMaior n�mero: " + num1);
		else if (num2 > num1)
			System.out.println("\nMaior n�mero: " + num2);
		else
			System.out.println("\nN�meros iguais.");

	}

}
