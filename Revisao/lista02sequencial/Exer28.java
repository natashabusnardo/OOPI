package lista02;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int qtds = 0;

		System.out.println("Telefonou para a vítima?");
		char res1 = entrada.next().charAt(0);

		System.out.println("Esteve no local do crime?");
		char res2 = entrada.next().charAt(0);

		System.out.println("Mora perto da vítima?");
		char res3 = entrada.next().charAt(0);

		System.out.println("Devia para a vítima?");
		char res4 = entrada.next().charAt(0);

		System.out.println("Já trabalhou com a vítima?");
		char res5 = entrada.next().charAt(0);

		entrada.close();

		if (res1 == 'S')
			qtds++;
		if (res2 == 'S')
			qtds++;
		if (res3 == 'S')
			qtds++;
		if (res4 == 'S')
			qtds++;
		if (res5 == 'S')
			qtds++;

		if (qtds == 0)
			System.out.println("Inocente.");
		else if (qtds == 2)
			System.out.println("Suspeita.");
		else if ((qtds >= 3) && (qtds <= 4))
			System.out.println("Cúmplice");
		else
			System.out.println("Suspeita.");
	}

}
