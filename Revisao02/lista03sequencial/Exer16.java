package lista03;

import java.util.Scanner;

public class Exer16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int menor = 0, maior = 0, soma = 0;

		System.out.print("Insira a quantidade de termos que deseja: ");
		int n = entrada.nextInt();
		entrada.close();

		for (int i = 1; i <= n; i++) {
			System.out.print("Insira um número: ");
			int num = entrada.nextInt();
			soma = soma + num;
			if (i == 1) {
				maior = num;
				menor = num;
			} else if (num > maior) {
				maior = num;
			} else if (num < menor) {
				menor = num;
			}

		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);

	}
}
