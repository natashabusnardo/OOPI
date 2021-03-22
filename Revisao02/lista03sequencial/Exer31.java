package lista03;

import java.util.Scanner;

public class Exer31 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float altura = 0, maior = 0, menor = 0, cmenor = 0, cmaior = 0;
		int numero = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira a altura: ");
			altura = entrada.nextFloat();

			System.out.print("Insira o número do aluno: ");
			numero = entrada.nextInt();

			if (i == 1) {
				maior = altura;
				menor = altura;
				cmaior = numero;
				cmenor = numero;
			} else if (altura > maior) {
				maior = altura;
				cmaior = numero;

			} else if (altura < menor) {
				menor = altura;
				cmenor = numero;
			}
		}
		entrada.close();

		System.out.println("Mais alto: " + maior + " código do aluno: " + cmaior);
		System.out.println("Mais baixo: " + menor + "código do aluno: " + cmenor);

	}
}
