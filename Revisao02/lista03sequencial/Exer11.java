package lista03;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int qtdi = 0;
		int qtdp = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Insira um número:");
			int num = entrada.nextInt();

			if (num % 2 == 0)
				qtdp++;
			else
				qtdi++;

		}
		entrada.close();

		System.out.println("Números ímpares:" + qtdi);
		System.out.println("Números pares:" + qtdp);

	}
}
