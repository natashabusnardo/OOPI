package lista03;

import java.util.Scanner;

public class Exer19 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cont = 0;
		int div = 0;

		System.out.print("Digite um número: ");
		int num = entrada.nextInt();
		entrada.close();

		do {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					cont++;
					div = div + 1;
				}
			}

			if (cont <= 2)
				System.out.println("Primo");

			else
				System.out.println("Não é primo.");

			num = num - 1;
			cont = 0;
		} while (num == 0);
		System.out.println("Número de divisões: " + div);
	}
}
