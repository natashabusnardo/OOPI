package lista02;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();

		entrada.close();

		float mediaf = (float) (nota1 + nota2) / 2;

		char conceito;

		if ((mediaf >= 0) && (mediaf < 4))
			conceito = 'E';

		else if ((mediaf >= 4) && (mediaf < 6))
			conceito = 'D';

		else if ((mediaf >= 6) && (mediaf < 7))
			conceito = 'C';

		else if ((mediaf >= 7) && (mediaf < 9))
			conceito = 'B';

		else
			conceito = 'A';

		if ((conceito == 'D') || (conceito == 'E'))
			System.out.println("Reprovado. ");

		else
			System.out.println("Aprovado. ");

	}

}
