package lista03;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int num = entrada.nextInt();

		entrada.close();

		boolean primo = true;

		for (int i = 1; i <= num; i++) {

			if ((i != num) && (i != 1) && (num % i == 0) && (num != 2) && (num != 9)) {
				primo = false;
				System.out.println("O n�mero " + num + " � divis�vel por " + i + ".");
			}
		}
		if (primo)
			System.out.println("O n�emro " + num + " � primo.");
		else
			System.out.println("O n�emro " + num + " n�o � primo.");

	}

}
