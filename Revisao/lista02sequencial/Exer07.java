package lista02;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escreva o primeiro número: ");
		int num1 = entrada.nextInt();

		System.out.print("Escreva o segundo número: ");
		int num2 = entrada.nextInt();

		System.out.print("Escreva o terceiro número: ");
		int num3 = entrada.nextInt();
		
		entrada.close();

		int maior1 = 0, maior2 = 0, maior3 = 0;

		if ((num1 > num2) && (num1 > num3)) {
			maior1 = num1;

			if (num2 > num3) {
				maior2 = num2;
				maior3 = num3;
			} else if (num3 > num2) {
				maior2 = num3;
				maior3 = num2;
			} else {
				maior2 = num2;
				maior3 = num3;
			}

		} else if ((num2 > num1) && (num2 > num3)) {
			maior1 = num2;

			if (num1 > num3) {
				maior2 = num1;
				maior3 = num3;
			} else if (num3 > num1) {
				maior2 = num3;
				maior3 = num1;
			} else {
				maior2 = num1;
				maior3 = num3;
			}
		} else if ((num3 > num1) && (num3 > num2)) {
			maior1 = num3;

			if (num1 > num2) {
				maior2 = num1;
				maior3 = num2;
			} else if (num2 > num1) {
				maior2 = num2;
				maior3 = num1;
			} else {
				maior2 = num1;
				maior3 = num2;
			}
		} else {
			System.out.println("Todos os números são iguais.");
		}
		System.out.println("Maior número: " + maior1);
		System.out.println("Segundo maior número: " + maior2);
		System.out.println("Menor número: " + maior3);

	}

}
