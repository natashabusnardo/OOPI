package lista01;

import java.util.Scanner;

public class Exer08 {

	/*
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
	 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor da sua hora.");
		double valorhora = entrada.nextDouble();

		System.out.println("Informe o número de horas trabalhadas no mês.");
		double qtdhoras = entrada.nextDouble();
		entrada.close();
		double salario = valorhora * qtdhoras;

		System.out.printf("O salário do mês é: %.2f.", salario);
	}

}
