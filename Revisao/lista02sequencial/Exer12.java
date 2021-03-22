package lista02;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o salário do colaborador: ");
		float salario = entrada.nextFloat();
		entrada.close();

		double txreajuste = 0.0;
		float vaumento = 0;
		float novosal = 0;

		if (salario < 280) {
			txreajuste = 0.2;
			vaumento = (float) (salario * txreajuste);
			novosal = salario + vaumento;
		} else if ((salario >= 280) && (salario < 700)) {
			txreajuste = 0.15;
			vaumento = (float) (salario * txreajuste);
			novosal = salario + vaumento;
		} else if ((salario >= 700) && (salario < 1500)) {
			txreajuste = 0.1;
			vaumento = (float) (salario * txreajuste);
			novosal = salario + vaumento;
		} else if (salario >= 1500) {
			txreajuste = 0.05;
			vaumento = (float) (salario * txreajuste);
			novosal = salario + vaumento;
		}

		System.out.println("Salário antes do reajuste " + salario + ".");
		System.out.println("Percentual de aumento aplicado " + txreajuste * 100 + "%.");
		System.out.println("Valor do aumento " + vaumento + ".");
		System.out.println("Novo salário " + novosal + ".");

	}
}
