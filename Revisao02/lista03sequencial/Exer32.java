package lista03;

import java.util.Scanner;

public class Exer32 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int codigo = 0, codigomaior = 0, codigomenor = 0, veiculos = 0, acidentes = 0, maioracidente = 0,
				menoracidente = 0, soma = 0, cont = 0, soma2 = 0;
		;

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o código da cidade: ");
			codigo = entrada.nextInt();

			System.out.print("Insira o número de veículos de passeio: ");
			veiculos = entrada.nextInt();
			soma = soma + veiculos;

			System.out.print("Insira o número de acidentes com vítimas: ");
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

		System.out.println("Maior índice: " + maioracidente + " código da cidade: " + codigomaior);
		System.out.println("Menor índice: " + menoracidente + " código da cidade: " + codigomenor);
		System.out.println("Média de veículos das cidades: " + soma / 5);
		System.out.println("Média de acidentes em cidades com menos de 2k de veículos: " + soma2 / cont);

	}
}
