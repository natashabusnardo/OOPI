package lista02;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o horário do dia(M/V/N): ");
		char hora = entrada.next().charAt(0);

		entrada.close();

		if (hora == 'M')
			System.out.println("Bom Dia!");

		else if (hora == 'V')
			System.out.println("Boa Tarde!");

		else if (hora == 'N')
			System.out.println("Boa Noite!");

		else
			System.out.println("Insira uma letra válida.");

	}
}
