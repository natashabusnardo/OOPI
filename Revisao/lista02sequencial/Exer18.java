package lista02;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva o primeiro lado: ");
		int num1 = entrada.nextInt();

		System.out.print("Escreva o segundo lado: ");
		int num2 = entrada.nextInt();

		System.out.print("Escreva o terceiro lado: ");
		int num3 = entrada.nextInt();

		entrada.close();

		if (((num1 + num2) > num3) || ((num1 + num3) > num2) || ((num2 + num3) > num1)) {
			if ((num2 == num1) && (num2 == num3))
				System.out.println("Tri�ngulo Equil�tero.");

			else if (((num3 == num1) && (num1 != num2)) || ((num3 == num2) && (num1 != num2)))
				System.out.println("Tri�ngulo Is�celes.");

			else if ((num3 != num1) && (num1 != num2))
				System.out.println("Tri�ngulo Escaleno.");

		}

		else
			System.out.println("N�o � um tri�ngulo.");

	}

}
