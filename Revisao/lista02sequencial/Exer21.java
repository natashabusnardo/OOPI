package lista02;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o dia: ");
		int dia = entrada.nextInt();

		System.out.print("Insira o mês: ");
		int mes = entrada.nextInt();

		System.out.print("Insira o ano: ");
		int ano = entrada.nextInt();

		entrada.close();

		boolean valido = false;

		if ((mes == 01) && (mes <= 12)) {
			if ((ano % 4 == 0)) {
				if ((dia >= 01) && (dia <= 31)) {

					if ((mes == 02) && ((dia >= 01) && (dia <= 28)))
						valido = true;

					else if (((mes == 1) || (mes == 3) || (mes == 5) || ((mes >= 7) && (mes <= 10)) || (mes == 12))
							&& ((dia >= 1) && (dia <= 31)))
						valido = true;

					else if (((mes == 4) || (mes == 6) || (mes == 9)) && ((dia >= 1) && (dia <= 3)))
						valido = true;

					else
						valido = false;
				}

			} else if ((ano % 4 != 0)) {
				if ((dia >= 01) && (dia <= 31)) {

					if ((mes == 02) && ((dia >= 01) && (dia <= 27)))
						valido = true;

					else if (((mes == 1) || (mes == 3) || (mes == 5) || ((mes >= 7) && (mes <= 10)) || (mes == 12))
							&& ((dia >= 1) && (dia <= 31)))
						valido = true;

					else if (((mes == 4) || (mes == 6) || (mes == 9)) && ((dia >= 1) && (dia <= 3)))
						valido = true;

					else
						valido = false;
				}
			}
			if (ano <= 0)
				valido = false;

		} else {
			valido = false;
		}

		if (valido)
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " é valida.");
		else
			System.out.println("A data " + dia + "/" + mes + "/" + ano + " não é valida.");

	}
}
