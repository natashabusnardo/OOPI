package lista03;

import java.util.Scanner;

public class Exer27 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int cont = 1;

		float soma = 0;

		System.out.println("---------Lojas Tabajara---------");

		System.out.print("Informe o valor do produto: ");
		float prod = entrada.nextFloat();

		while (prod != 0) {

			System.out.println("Produto " + cont + ": R$" + prod);
			soma = soma + prod;
			cont++;

			System.out.print("Informe o valor do produto: ");
			prod = entrada.nextFloat();

		}
		entrada.close();
		System.out.println("Total: R$" + soma);
		System.out.println("Dinheiro: R$");
		int dinheiro = entrada.nextInt();
		System.out.println("Troco: R$" + (dinheiro - soma));

	}
}
