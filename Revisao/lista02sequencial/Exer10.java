package lista02;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva o primeiro n�mero: ");
		int num1 = entrada.nextInt();

		System.out.print("Escreva o segundo n�mero: ");
		int num2 = entrada.nextInt();

		System.out.print("Escreva o terceiro n�mero: ");
		int num3 = entrada.nextInt();

		entrada.close();

		int maior1 = 0, menor = 0;

		if ((num1 > num2) && (num1 > num3)) {
			maior1 = num1;

			if (num2 > num3)
				menor = num3;

			else if (num3 > num2)

				menor = num2;

			else
				menor = num3;

		} else if ((num2 > num1) && (num2 > num3)) {
			maior1 = num2;

			if (num1 > num3)
				menor = num3;

			else if (num3 > num1)
				menor = num1;

			else
				menor = num3;
		} else if ((num3 > num1) && (num3 > num2)) {
			maior1 = num3;

			if (num1 > num2)
				menor = num2;

			else if (num2 > num1)
				menor = num1;
			else
				menor = num2;
		} else {
			System.out.println("Todos os n�meros s�o iguais.");
		}
		System.out.println("Maior n�mero: " + maior1);
		System.out.println("Menor n�mero: " + menor);

	}

}
