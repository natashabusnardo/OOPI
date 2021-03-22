package lista01;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o tamanho(m²) da área a ser pintada: ");
		float area = entrada.nextFloat();

		entrada.close();

		float litro = (area / 3);
		float qtd = litro / 18;
		float valor = qtd * 80;
		System.out.println("Quantidade de latas: " + qtd + ".");
		System.out.println("Valor a ser pago: " + valor + ".");

	}
}
