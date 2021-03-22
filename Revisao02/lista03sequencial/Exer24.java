package lista03;

import java.util.Scanner;

public class Exer24 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira a quantidade de CDs:");
		int qtdcds = entrada.nextInt();

		float soma = 0;
		int cont = 0;
		float vcd = 0;
		float media = 0;
		for (int i = 0; i < qtdcds; i++) {

			System.out.print("Informe o valor pago no CD " + (i + 1));
			vcd = entrada.nextFloat();
			soma = soma + vcd;
			cont++;

		}
		media = soma / cont;
		entrada.close();

		System.out.println("Média do valor dos CDs: " + media);

	}
}
