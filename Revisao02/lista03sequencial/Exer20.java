package lista03;

import java.util.Scanner;

public class Exer20 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o número de notas para realização da média:");
		int num = entrada.nextInt();
		entrada.close();
		float soma = 0;
		int cont = 0;
		float notaf = 0;
		for (int i = 0; i < num; i++) {

			System.out.print("Informe a nota: ");
			float nota = entrada.nextFloat();

			soma = soma + nota;
			cont++;

		}

		notaf = soma / cont;

		System.out.println("Média " + notaf);

	}
}
