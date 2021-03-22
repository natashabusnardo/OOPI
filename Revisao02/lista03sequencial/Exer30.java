package lista03;

import java.util.Scanner;

public class Exer30 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float menor = 0, maior = 0, magro = 0, gordo = 0, altura = 0, peso = 0;

		System.out.print("Digite o código do processo: ");
		int codigo = entrada.nextInt();

		int cont = 1;
		while (codigo != 0) {

			System.out.print("Insira a altura: ");
			altura = entrada.nextFloat();

			System.out.print("Insira o peso: ");
			peso = entrada.nextFloat();

			if (cont == 1) {
				maior = altura;
				menor = altura;
				magro = peso;
				gordo = peso;
			} else if (altura > maior) {
				maior = altura;

			} else if (altura < menor) {
				menor = altura;
			} else if (peso > gordo) {
				gordo = peso;

			} else if (peso < magro) {
				magro = peso;
			}
			System.out.print("Digite o código do processo: ");
			codigo = entrada.nextInt();
			cont++;

		}
		entrada.close();
		System.out.println("Mais alto: " + maior);
		System.out.println("Mais baixo: " + menor);
		System.out.println("Mais magro: " + magro);
		System.out.println("Mais gordo: " + gordo);

	}
}
