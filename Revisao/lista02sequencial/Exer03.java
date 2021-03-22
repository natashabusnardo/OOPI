package lista02;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o seu sexo(M/F): ");
		char sexo = entrada.next().charAt(0);

		entrada.close();

		if (sexo == 'M')
			System.out.println("Masculino");

		else if (sexo == 'F')
			System.out.println("Feminino");

		else
			System.out.println("Insira uma letra válida.");

	}
}
