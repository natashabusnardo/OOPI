package lista03;

import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o primeiro n�mero do intervalo. ");
		int num1 = entrada.nextInt();

		System.out.print("Insira o segundo n�mero do intervalo. ");
		int num2 = entrada.nextInt();

		entrada.close();

		int soma = 0;

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
			soma = soma + i;
		}
		System.out.println("A soma dos n�meros do intervalo �:" + soma);

	}
}
