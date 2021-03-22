package lista02;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor do saque: ");
		int valor = entrada.nextInt();
		int qtd100 = 0;
		int qtd50 = 0;
		int qtd10 = 0;
		int qtd5 = 0;
		int qtd1 = 0;

		if ((valor <= 600) && (valor >= 10)) {
			do {
				if (valor % 100 == 0) {
					qtd100++;
					valor = valor - 100;
				} else if (valor % 50 == 0) {
					qtd50++;
					valor = valor - 50;
				} else if (valor % 10 == 0) {
					qtd10++;
					valor = valor - 10;
				} else if (valor % 5 == 0) {
					qtd5++;
					valor = valor - 5;
				} else if (valor % 1 == 0) {
					qtd1++;
					valor = valor - 1;
				}
			} while (valor > 1);

			System.out.println("O pagrama fornece " + qtd100 + " notas de 100.");
			System.out.println("O pagrama fornece " + qtd50 + " notas de 50.");
			System.out.println("O pagrama fornece " + qtd10 + " notas de 10.");
			System.out.println("O pagrama fornece " + qtd5 + " notas de 5.");
			System.out.println("O pagrama fornece " + qtd1 + " notas de 1.");
		} else {
			System.out.println("Insira um valor dentro do intervalo.");
		}

	}
}
