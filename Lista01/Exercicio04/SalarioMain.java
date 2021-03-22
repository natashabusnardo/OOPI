package Exercicio04;

import java.util.Scanner;

public class SalarioMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		Salario sal = new Salario();
		
		System.out.println("Valor por hora: ");
		float valorPHora = entrada.nextFloat();
		System.out.println("Quantidade de horas trabalhadas: ");
		int qtdHoras = entrada.nextInt();
		
		sal.setQtdHoras(qtdHoras);
		sal.setValorPHora(valorPHora);
		sal.salarioLiquido();
		entrada.close();
		
	}

}
