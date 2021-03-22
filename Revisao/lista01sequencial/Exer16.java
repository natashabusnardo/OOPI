package lista01;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o tamanho(m²) da área a ser pintada: ");
		float area = entrada.nextFloat();

		entrada.close();

		float litro = (area / 6);
		float qtd18 = litro / 18;
		float valor18 = qtd18 * 80;
		float qtd3 = litro / 3;
		float valor3 = qtd3 * 25;

		System.out.println("Quantidade de latas de 18 litros: " + qtd18 + ".");
		System.out.println("Valor a ser pago nessa quantidade: " + valor18 + ".");
		System.out.println("Quantidade de latas de 3 litros: " + qtd3 + ".");
		System.out.println("Valor a ser pago nessa quantidade: " + valor3 + ".");

	}
}
