package lista02;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();

		float mediaf = (float) (nota1 + nota2) / 2;

		entrada.close();

		if (mediaf >= 7)
			System.out.println("Aprovado.");

		else
			System.out.println("Reprovado.");

	}

}
