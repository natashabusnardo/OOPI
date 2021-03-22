package lista02;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();

		entrada.close();

		float mediaf = (float) (nota1 + nota2) / 2;

		if ((mediaf >= 0) && (mediaf < 3))
			System.out.println("Reprovado.");

		else if ((mediaf >= 3) && (mediaf < 7))
			System.out.println("Em exame.");

		else
			System.out.println("Aprovado.");

	}

}
