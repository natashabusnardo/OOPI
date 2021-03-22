package lista02;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();

		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();

		System.out.print("Informe a terceira nota: ");
		float nota3 = entrada.nextFloat();

		entrada.close();

		float notaf = (float) (nota1 + nota2 + nota3) / 3;

		if (notaf < 7)
			System.out.println("Reprovado com média " + notaf);

		else if ((notaf >= 7) && (notaf < 10))
			System.out.println("Aprovado com média " + notaf);
		else
			System.out.println("Aprovado com Distinção.");

	}

}
