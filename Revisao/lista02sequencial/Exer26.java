package lista02;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o n�mero: ");
		float num = entrada.nextFloat();
		entrada.close();

		if (num % 2 == 0)
			System.out.println("Par.");
		else
			System.out.println("�mpar.");

	}

}
