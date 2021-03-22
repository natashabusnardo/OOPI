package lista02;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		entrada.close();

		System.out.print("Insira a letra desejada: ");
		char letra = entrada.next().charAt(0);

		if ((letra == 'A') || (letra == 'E') || (letra == 'I') || (letra == 'O') || (letra == 'U'))
			System.out.println("Vogal.");

		else
			System.out.println("Consoante.");

	}
}
