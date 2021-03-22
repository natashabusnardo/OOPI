package lista03;

import java.util.Scanner;

public class Exer36 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, cont = 0;

		System.out.print(
				"Insira o seu voto: \n 1 - Anthony \n 2 - Benedict \n 3 - Cameron \n 4 - Daphne \n 5 - Nulo \n6- Branco");
		int n = entrada.nextInt();

		while (n > 0) {
			cont++;
			if (n == 1) {
				c1++;
			} else if (n == 2) {
				c2++;
			} else if (n == 3) {
				c3++;
			} else if (n == 4) {
				c4++;
			} else if (n == 5) {
				c5++;
			} else if (n == 6) {
				c6++;
			} else {
				System.out.println("Insira um voto válido.");
			}
			System.out.print("Insira um número: ");
			n = entrada.nextInt();
		}
		entrada.close();

		System.out.println("Votos do candidato 1: " + c1);
		System.out.println("Votos do candidato 2: " + c2);
		System.out.println("Votos do candidato 2: " + c3);
		System.out.println("Votos do candidato 3: " + c4);
		System.out.println("Porcentagem de votos nulos: " + ((c5 * 100) / cont) + "%.");
		System.out.println("Porcentagem de votos brancos: " + ((c6 * 100) / cont) + "%.");
	}
}
