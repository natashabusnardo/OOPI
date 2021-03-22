package lista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		double perc = 0.0;
		double perc1 = 0.2;
		double perc2 = 0.15;
		double perc3 = 0.1;
		double perc4 = 0.05;

		double novoSalario = 0.0;
		double valorAumento = 0.0;

		System.out.println("Informe o salário:");
		double salario = entrada.nextDouble();

		if (salario <= 280) {
			novoSalario = salario + (salario * perc1);
			perc = perc1 * 100;
		} else if (salario > 280 && salario <= 700) {
			novoSalario = salario + (salario * perc2);
			perc = perc2 * 100;
		} else if (salario > 700 && salario <= 1500) {
			novoSalario = salario + (salario * perc3);
			perc = perc3 * 100;
		} else {
			novoSalario = salario + (salario * perc4);
			perc = perc4 * 100;
		}

		valorAumento = novoSalario - salario;

		System.out.println("Salário antes do reajuste: " + salario + ".");
		System.out.println("Percentual de aumento aplicado: " + perc + "%.");
		System.out.println("Valor do aumento: R$" + valorAumento + ".");
		System.out.println("Novo salário: R$" + novoSalario + ".");

	}

}
