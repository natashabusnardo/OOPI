package lista03;

import java.util.Scanner;

public class Exer32 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int codigo = 0, codigomaior = 0, codigomenor = 0, veiculos = 0, acidentes = 0, maioracidente = 0,
				menoracidente = 0, soma = 0, cont = 0, soma2 = 0;
		;

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o c�digo da cidade: ");
			codigo = entrada.nextInt();

			System.out.print("Insira o n�mero de ve�culos de passeio: ");
			veiculos = entrada.nextInt();
			soma = soma + veiculos;

			System.out.print("Insira o n�mero de acidentes com v�timas: ");
			acidentes = entrada.nextInt();

			entrada.close();

			if (i == 1) {
				codigomaior = codigo;
				codigomenor = codigo;
				maioracidente = acidentes;
				menoracidente = acidentes;
			} else if (acidentes > maioracidente) {
				maioracidente = acidentes;
				codigomaior = codigo;

			} else if (acidentes < menoracidente) {
				menoracidente = acidentes;
				codigomenor = codigo;
			}

			if (veiculos <= 2000) {
				soma2 = soma2 + acidentes;
				cont++;
			}
		}

		System.out.println("Maior �ndice: " + maioracidente + " c�digo da cidade: " + codigomaior);
		System.out.println("Menor �ndice: " + menoracidente + " c�digo da cidade: " + codigomenor);
		System.out.println("M�dia de ve�culos das cidades: " + soma / 5);
		System.out.println("M�dia de acidentes em cidades com menos de 2k de ve�culos: " + soma2 / cont);

	}
}
