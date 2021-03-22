package lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double pesoIdeal = 0.0;

		System.out.println("Informe a sua altura:");
		double altura = entrada.nextDouble();

		System.out.println("Informe o seu peso:");
		double peso = entrada.nextDouble();

		System.out.println("Informe o seu sexo: (M/F)");
		char sexo = entrada.next().charAt(0);

		if (sexo == 'F')
			pesoIdeal = (62.1 * altura) - 44.7;

		else if (sexo == 'M')
			pesoIdeal = (72.7 * altura) - 58;

		System.out.println("O seu peso ideal é: " + pesoIdeal);

		if (peso <= pesoIdeal)
			System.out.println("Você está abaixo do seu peso ideal");

		else if (peso >= pesoIdeal)
			System.out.println("Você está acima do seu peso ideal");
		else
			System.out.println("Você está no seu peso ideal");
	}

}
