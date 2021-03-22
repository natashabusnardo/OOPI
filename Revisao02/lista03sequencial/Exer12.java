package lista03;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = 1, num2 = 0;

		System.out.print("Insira a quantidade de termos que deseja: ");
		int n = entrada.nextInt();

		entrada.close();

		for (int i = 1; i <= n; i++) {
			if (i == 1)
				System.out.println(0);
			else if (i == 2)
				System.out.println(1);

			num1 = num1 + num2;
			num2 = num1 - num2;
			System.out.println(num1);
		}

	}
}
