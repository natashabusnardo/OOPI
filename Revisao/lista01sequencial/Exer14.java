package lista01;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor da sua hora de trabalho: ");
		float valorhora = entrada.nextFloat();

		System.out.print("Insira o valor de horas trabalhadas no m�s: ");
		float numerohora = entrada.nextFloat();

		entrada.close();

		double salario = valorhora * numerohora;
		double inss = salario * 0.08;
		double sindicato = salario * 0.05;
		double ir = salario * 0.11;
		double desconto = inss + sindicato + ir;
		float salliq = (float) (salario - desconto);

		System.out.println("Sal�rio do seu m�s ser� " + salario + ".");
		System.out.println("INSS: " + inss + ".");
		System.out.println("Sindicato " + sindicato + ".");
		System.out.println("Sal�rio l�quido " + salliq + ".");
		System.out.println("Desconto " + desconto + ".");

	}
}
