package lista03;

import java.util.Scanner;

public class Exer34 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i1 = 0, i2 = 0, i3 = 0, i4 = 0;

		System.out.print("Insira um número: ");
		int n = entrada.nextInt();

		while (n > 0) {

			if ((n > 0) && (n <= 25)) {
				i1++;
			} else if ((n > 26) && (n <= 50)) {
				i2++;
			} else if ((n > 50) && (n <= 75)) {
				i3++;
			} else if (n > 75) {
				i4++;
			}
			System.out.print("Insira um número: ");
			n = entrada.nextInt();
		}
		entrada.close();

		System.out.println("Números no intervalo de 0-25: " + i1);
		System.out.println("Números no intervalo de 26-50: " + i2);
		System.out.println("Números no intervalo de 50-75: " + i3);
		System.out.println("Números acima de 75: " + i4);
	}
}
