package lista02;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o seu sexo(M/F): ");
		String sexo = entrada.nextLine();

		System.out.print("Insira a sua altura: ");
		float altura = entrada.nextFloat();

		System.out.print("Insira ao seu peso: ");
		float peso = entrada.nextFloat();

		entrada.close();

		double pesoideal;

		if (sexo == "M")
			pesoideal = (72.7 * altura) - 58;

		else
			pesoideal = (61.1 * altura) - 44.7;

		String situacao = "";

		if (pesoideal < peso)
			situacao = "Acima do peso.";
		else if (pesoideal > peso)
			situacao = "Abaixo do peso.";
		else
			situacao = "Peso ideal.";

		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("O seu peso ideal é: " + pesoideal);
		System.out.println("Situação: " + situacao);

	}
}
