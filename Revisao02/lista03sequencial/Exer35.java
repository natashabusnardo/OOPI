package lista03;

import java.util.Scanner;

public class Exer35 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("---------Lanchonete Boa Gula---------");

		System.out.print("Informe o código do produto: ");
		int codigo = entrada.nextInt();

		int qtd = 0;
		float soma = 0;

		while (codigo != 0) {

			System.out.println("Informe a quantidade desejada:");
			qtd = entrada.nextInt();

			if (codigo == 100)
				soma = (float) (soma + (qtd * 1.2));
			else if (codigo == 101)
				soma = (float) (soma + (qtd * 1.3));
			else if (codigo == 102)
				soma = (float) (soma + (qtd * 1.5));
			else if (codigo == 103)
				soma = (float) (soma + (qtd * 1.2));
			else if (codigo == 104)
				soma = (float) (soma + (qtd * 1));
			else
				System.out.println("Informe um código válido.");

			System.out.print("Informe o código do produto: ");
			codigo = entrada.nextInt();

		}
		entrada.close();

		System.out.println("Total: R$" + soma);
	}
}
