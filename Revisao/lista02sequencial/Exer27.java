package lista02;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o n�mero: ");
		float num = entrada.nextFloat();

		entrada.close();

		if (num > Math.floor(num))
			System.out.println("Decimal");
		else
			System.out.println("Inteiro.");

	}

}
