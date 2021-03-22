package lista02;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o número: ");
		int num = entrada.nextInt();
		entrada.close();

		int numc = 0;
		int numd = 0;
		int numu = 0;

		if (num < 1000) {

			numc = num / 100;
			numd = (num - (numc * 100)) / 10;
			numu = (num - ((numc * 100) + (numd * 10)));

			if (numc > 1) {
				if (numd > 1) {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numc + " centenas, " + numd + " dezenas e "
								+ numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numc + " centenas, " + numd + " dezenas e "
								+ numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numc + " centenas e " + numd + " dezenas.");
				} else if (numd == 1) {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numc + " centenas, " + numd + " dezena e "
								+ numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numc + " centenas, " + numd + " dezena e "
								+ numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numc + " centenas e " + numd + " dezena.");
				} else {
					if (numu > 1)
						System.out
								.println("O número " + num + " possui " + numc + " centenas  e " + numu + " unidades.");
					else if (numu == 1)
						System.out
								.println("O número " + num + " possui " + numc + " centenas  e " + numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numc + " centenas.");
				}

			} else if (numc == 1) {
				if (numd > 1) {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numc + " centena, " + numd + " dezenas e "
								+ numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numc + " centena, " + numd + " dezenas e "
								+ numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numc + " centena e " + numd + " dezenas.");
				} else if (numd == 1) {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numc + " centena, " + numd + " dezena e "
								+ numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numc + " centena, " + numd + " dezena e "
								+ numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numc + " centena e " + numd + " dezena.");
				} else {
					if (numu > 1)
						System.out
								.println("O número " + num + " possui " + numc + " centena  e " + numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numc + " centena  e " + numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numc + " centena.");
				}

			} else {
				if (numd > 1) {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numd + " dezenas e " + numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numd + " dezenas e " + numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numd + " dezenas.");
				} else if (numd == 1) {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numd + " dezena e " + numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numd + " dezena e " + numu + " unidade.");
					else
						System.out.println("O número " + num + " possui " + numd + " dezena.");
				} else {
					if (numu > 1)
						System.out.println("O número " + num + " possui " + numu + " unidades.");
					else if (numu == 1)
						System.out.println("O número " + num + " possui " + numu + " unidade.");
					else if (num == 0)
						System.out.println("Número é zero.");
					else
						System.out.println("Insira um número positivo.");
				}

			}

		} else {
			System.out.println("Insira um número menor que 1000.");
		}

	}
}
