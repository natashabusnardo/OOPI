package lista01;

import java.util.Scanner;

public class Exer08 {

	/*
	 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
	 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor da sua hora.");
		double valorhora = entrada.nextDouble();

		System.out.println("Informe o n�mero de horas trabalhadas no m�s.");
		double qtdhoras = entrada.nextDouble();
		entrada.close();
		double salario = valorhora * qtdhoras;

		System.out.printf("O sal�rio do m�s �: %.2f.", salario);
	}

}
