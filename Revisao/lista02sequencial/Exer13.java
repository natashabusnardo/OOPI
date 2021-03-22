package lista02;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o valor da sua hora de trabalho: ");
		float valorhora = entrada.nextFloat();

		System.out.print("Insira o valor de horas trabalhadas no mês: ");
		float numerohora = entrada.nextFloat();

		entrada.close();

		double salario = valorhora * numerohora;
		double ir = 0.0;
		@SuppressWarnings("unused")
		double sindicato = salario * 0.03;
		double fgts = salario * 0.11;
		double inss = salario * 0.1;

		if (salario < 900)
			ir = 0.0;

		else if ((salario >= 900) && (salario < 1500))
			ir = salario * 0.05;

		else if ((salario >= 1500) && (salario < 2500))
			ir = salario * 0.1;

		else if (salario >= 2500)
			ir = 0.2;

		double desconto = ir + inss;
		float salliq = (float) (salario - desconto);

		System.out.println("Salário bruto: " + salario + ".");
		System.out.println("IR: " + ir + ".");
		System.out.println("INSS: " + inss + ".");
		System.out.println("FGTS " + fgts + ".");
		System.out.println("Salário líquido " + salliq + ".");
		System.out.println("Desconto " + desconto + ".");

	}
}