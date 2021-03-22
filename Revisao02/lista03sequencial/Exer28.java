package lista03;

import java.util.Scanner;

public class Exer28 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float menor = 0, maior = 0, soma = 0;

		System.out.print("Insira a quantidade de temperaturas: ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Insira a temperatura: ");
			float temp = entrada.nextFloat();
			soma = soma + temp;
			if (i == 1) {
				maior = temp;
				menor = temp;
			} else if (temp > maior) {
				maior = temp;
			} else if (temp < menor) {
				menor = temp;
			}

		}
		entrada.close();
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Média: " + (soma / n));

	}
}
